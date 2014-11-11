import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;

import javax.swing.JFrame;

public class Screen {

	private GraphicsDevice videoCard;

	public Screen() {
		GraphicsEnvironment env = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		videoCard = env.getDefaultScreenDevice();
	}

	public void setFullScreen(DisplayMode displayMode, JFrame window) {
		window.setUndecorated(true); // no title bar or scroll bar
		window.setResizable(false); // can't be resized
		videoCard.setFullScreenWindow(window);

		if (displayMode != null && videoCard.isDisplayChangeSupported()) {
			try {
				videoCard.setDisplayMode(displayMode);
			} catch (Exception ex) {
			}
		}
	}

	public Window getFullScreenWindow() {
		return videoCard.getFullScreenWindow();
	}

	public void restoreScreen() {
		Window window = videoCard.getFullScreenWindow();
		
		if (window != null) {
			window.dispose();
		}
		
		videoCard.setFullScreenWindow(null);
	}
}
// olivia's computer