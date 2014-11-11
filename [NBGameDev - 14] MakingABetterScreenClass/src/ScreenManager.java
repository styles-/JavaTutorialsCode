import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

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
	}

	// get current display mode
	public DisplayMode getCurrentDisplayMode() {
		return videoCard.getDisplayMode();
	}

	public boolean displayModesMatch(DisplayMode displayMode,
			DisplayMode displayMode2) {
		return false;
	}
}
