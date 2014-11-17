import java.awt.DisplayMode;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class ScreenManager {

	private GraphicsDevice videoCard;

	// give videoCard access to monitor screen
	public ScreenManager() {
		GraphicsEnvironment env = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		videoCard = env.getDefaultScreenDevice();
	}

	// get all compatible display modes
	public DisplayMode[] getCompatibleDisplayModes() {
		return videoCard.getDisplayModes();
	}

	// compares displaymode passed in to videocard displaymode and
	// see if they match
	public DisplayMode findFirstCompatibleMode(DisplayMode displayModes[]) {
		DisplayMode goodModes[] = videoCard.getDisplayModes();

		for (int i = 0; i < displayModes.length; i++) {
			for (int j = 0; j < goodModes.length; j++) {
				if (displayModesMatch(displayModes[i], goodModes[j])) {
					return displayModes[i];
				}
			}
		}
		return null;
	}

	// get current display mode
	public DisplayMode getCurrentDisplayMode() {
		return videoCard.getDisplayMode();
	}

	public boolean displayModesMatch(DisplayMode mode, DisplayMode mode2) {
		if (mode.getWidth() != mode2.getWidth()
				|| mode.getHeight() != mode2.getHeight()) {
			return false;
		}

		if (mode.getBitDepth() != DisplayMode.BIT_DEPTH_MULTI
				&& mode2.getBitDepth() != DisplayMode.BIT_DEPTH_MULTI
				&& mode.getBitDepth() != mode2.getBitDepth()) {
			return false;
		}

		if (mode.getRefreshRate() != DisplayMode.REFRESH_RATE_UNKNOWN
				&& mode2.getRefreshRate() != DisplayMode.REFRESH_RATE_UNKNOWN
				&& mode.getRefreshRate() != mode2.getRefreshRate()) {
			return false;
		}

		return true;
	}

	// make frame full screen
	public void setFullScreen(DisplayMode displayMode) {
		JFrame frame = new JFrame();
		frame.setUndecorated(true);
		frame.setIgnoreRepaint(true);
		frame.setResizable(false);
		videoCard.setFullScreenWindow(frame);

		if (displayMode != null && videoCard.isDisplayChangeSupported()) {
			try {
				videoCard.setDisplayMode(displayMode);
			} catch (Exception ex) {
			}
		}

		frame.createBufferStrategy(2);
	}

	// we will set Graphics object = to whatever this returns
	public Graphics2D getGraphics() {
		Window window = videoCard.getFullScreenWindow();

		if (window != null) {
			BufferStrategy strategy = window.getBufferStrategy();
			return (Graphics2D) strategy.getDrawGraphics();
		} else
			return null;
	}
	
	// updates display
	public void update() {
		Window window = videoCard.getFullScreenWindow();
		
		if (window != null) {
			BufferStrategy strategy = window.getBufferStrategy();
			
			if (!strategy.contentsLost()) {
				strategy.show();
			}
		}
	}
	
	// returns full screen window
	public Window getFullScreenWindow() {
		return videoCard.getFullScreenWindow();
	}
	
	// get width of window
	public int getWidth() {
		Window window = videoCard.getFullScreenWindow();
		
		if (window != null) {
			return window.getWidth();
		} else
			return 0;
	}
	
	// get height of window
	public int getHeight() {
		Window window = videoCard.getFullScreenWindow();
		
		if (window != null) {
			return window.getHeight();
		} else
			return 0;
	}
	
	// get out of fullscreen
	public void restoreScreen() {
		Window window = videoCard.getFullScreenWindow();
		
		if (window != null) {
			window.dispose();
		}
		
		videoCard.setFullScreenWindow(null);
	}
	
	// create image compatible with monitor
	public BufferedImage createCompatibleImage(int width, int height, int transparency) {
		Window window = videoCard.getFullScreenWindow();
		
		if (window != null) {
			GraphicsConfiguration gc = window.getGraphicsConfiguration();
			return gc.createCompatibleImage(width, height, transparency);
		} else
			return null;
	}
}
