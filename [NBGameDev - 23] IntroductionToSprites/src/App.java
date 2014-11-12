import java.awt.DisplayMode;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class App {

	private ScreenManager screen;
	private Image background;
	private Animation animation;
	private Sprite sprite;

	private static final DisplayMode modes[] = {
			new DisplayMode(1920, 1080, 32, DisplayMode.REFRESH_RATE_UNKNOWN),
			new DisplayMode(1920, 1080, 24, DisplayMode.REFRESH_RATE_UNKNOWN),
			new DisplayMode(1920, 1080, 16, DisplayMode.REFRESH_RATE_UNKNOWN),
			new DisplayMode(800, 600, 32, DisplayMode.REFRESH_RATE_UNKNOWN),
			new DisplayMode(800, 600, 24, DisplayMode.REFRESH_RATE_UNKNOWN),
			new DisplayMode(800, 600, 16, DisplayMode.REFRESH_RATE_UNKNOWN) };

	public static void main(String[] args) {
		App app = new App();
		app.run();
	}

	public void loadImages() {
		background = new ImageIcon("background.png").getImage();
		Image tri1 = new ImageIcon("triangle1.png").getImage();
		Image tri2 = new ImageIcon("triangle2.png").getImage();

		animation = new Animation();
		animation.addScene(tri1, 250);
		animation.addScene(tri2, 250);

		sprite = new Sprite(animation);
		sprite.setxVelocity(0.5f);
		sprite.setyVelocity(0.5f);

	}

	public void run() {
		screen = new ScreenManager();

		try {
			DisplayMode displayMode = screen.findFirstCompatibleMode(modes);
			screen.setFullScreen(displayMode);
			loadImages();
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
			// animation.update(timePassed);
			update(timePassed);

			// draw and update screen
			Graphics2D graphics = screen.getGraphics();
			draw(graphics);
			graphics.dispose();
			screen.update();

			try {
				Thread.sleep(20);
			} catch (Exception ex) {
			}
		}

	}

	private void update(long timePassed) {
		if (sprite.getxPosition() <= 0) {
			sprite.setxVelocity(Math.abs(sprite.getxVelocity()));
		} else if (sprite.getxPosition() + sprite.getWidth() >= screen
				.getWidth()) {
			sprite.setxVelocity(-Math.abs(sprite.getxVelocity()));
		}

		if (sprite.getyPosition() <= 0) {
			sprite.setyVelocity(Math.abs(sprite.getyVelocity()));
		} else if (sprite.getyPosition() + sprite.getHeight() >= screen
				.getHeight()) {
			sprite.setyVelocity(-Math.abs(sprite.getyVelocity()));
		}

		sprite.update(timePassed);
	}

	public void draw(Graphics graphics) {
		graphics.drawImage(background, 0, 0, null);
		// graphics.drawImage(animation.getImage(), 0, 0, null);
		graphics.drawImage(sprite.getImage(),
				Math.round(sprite.getxPosition()),
				Math.round(sprite.getyPosition()), null);
	}
}
