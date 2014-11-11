import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsDevice;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Images extends JFrame {

	private GraphicsDevice videoCard;

	public static void main(String[] args) {
		DisplayMode displayMode = new DisplayMode(1920, 1080, 32,
				DisplayMode.REFRESH_RATE_UNKNOWN);

		Images image = new Images();
		image.run(displayMode);
	}

	private Screen screen;
	private Image background;
	private Image pic;
	private boolean loaded;

	public void run(DisplayMode displayMode) {
		setBackground(Color.LIGHT_GRAY);
		setForeground(Color.BLACK);
		setFont(new Font("Arial", Font.PLAIN, 24));
		loaded = false;

		screen = new Screen();

		try {
			screen.setFullScreen(displayMode, this);
			loadPics();
			try {
				Thread.sleep(5000);
			} catch (Exception ex) {
			}
		} finally {
			screen.restoreScreen();
		}
	}

	public void loadPics() {
		background = new ImageIcon("background.png").getImage();
		pic = new ImageIcon("triangle.png").getImage();
		loaded = true;
		repaint();
	}

	// called automatically from JFrame once
	// Graphics2D subclass of Graphics class
	public void paint(Graphics graphics) {
		if (graphics instanceof Graphics2D) {
			Graphics2D g2 = (Graphics2D) graphics;
			g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
					RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		}
		// graphics.drawString("This is gonna be awesome", 200, 200);
		if (loaded) {
			graphics.drawImage(background, 0, 0, null);
			graphics.drawImage(pic, 170, 180, null);
		}
	}
}
