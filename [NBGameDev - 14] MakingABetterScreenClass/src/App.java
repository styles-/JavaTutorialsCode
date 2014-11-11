import java.awt.DisplayMode;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class App {

	private Screen screen;
	private Image background;
	private Animation animation;

	public static void main(String[] args) {
		DisplayMode displayMode = new DisplayMode(1920, 1080, 32,
				DisplayMode.REFRESH_RATE_UNKNOWN);
		App app = new App();
		app.run(displayMode);
	}

	public void run(DisplayMode displayMode) {
		screen = new Screen();
		try {
			screen.setFullScreen(displayMode, new JFrame());
			loadPics();
			movieLoop();
		} finally {
			screen.restoreScreen();
		}
	}

	public void movieLoop() {
		long startingTime = System.currentTimeMillis();
		long cummulativeTime = startingTime;

		while (cummulativeTime - startingTime < 5000) {
			long timePassed = System.currentTimeMillis() - cummulativeTime;
			cummulativeTime += timePassed;
			animation.update(timePassed);
			
			Graphics graphics = screen.getFullScreenWindow().getGraphics();
			draw(graphics);
			graphics.dispose();
			
			try {
				Thread.sleep(20);
			} catch(Exception ex) {}
		}
		
	}

	public void draw(Graphics graphics) {
		graphics.drawImage(background, 0, 0, null);
		graphics.drawImage(animation.getImage(), 0, 0, null);
	}

	public void loadPics() {
		background = new ImageIcon("background.png").getImage();
		Image tri1 = new ImageIcon("triangle1.png").getImage();
		Image tri2 = new ImageIcon("triangle2.png").getImage();
		animation = new Animation();
		animation.addScene(tri1, 250);
		animation.addScene(tri2, 250);
	}
}
