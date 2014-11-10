import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsDevice;
import java.awt.RenderingHints;

import javax.swing.JFrame;

public class App extends JFrame {

	private GraphicsDevice videoCard;

	public static void main(String[] args) {
		DisplayMode displayMode = new DisplayMode(800, 600, 16,
				DisplayMode.REFRESH_RATE_UNKNOWN);

		App app = new App();
		app.run(displayMode);
	}

	public void run(DisplayMode displayMode) {
		setBackground(Color.LIGHT_GRAY);
		setForeground(Color.BLACK);
		setFont(new Font("Arial", Font.PLAIN, 24));

		Screen screen = new Screen();

		try {
			screen.setFullScreen(displayMode, this);
			try {
				Thread.sleep(5000);
			} catch (Exception ex) {
			}
		} finally {
			screen.restoreScreen();
		}
	}
	
	// called automatically from JFrame once
	// Graphics2D subclass of Graphics class
	public void paint(Graphics graphics) {
		if (graphics instanceof Graphics2D) {
			Graphics2D g2 = (Graphics2D) graphics;
			g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		}
		graphics.drawString("This is gonna be awesome", 200, 200);
	}
	//JGD7
	// cody commit
}
