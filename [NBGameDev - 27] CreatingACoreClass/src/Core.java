import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Window;

public abstract class Core {
	private static DisplayMode displayModes[] = {
			new DisplayMode(1024, 768, 32, 0),
			new DisplayMode(1024, 768, 24, 0),
			new DisplayMode(1024, 768, 16, 0),
			new DisplayMode(800, 600, 32, 0), new DisplayMode(800, 600, 24, 0),
			new DisplayMode(800, 600, 16, 0), };
	private boolean running;
	protected ScreenManager screen;

	// stop method
	public void stop() {
		running = false;
	}

	// call init and gameloop
	public void run() {
		try {
			init();
			gameLoop();
		} finally {
			screen.restoreScreen();
		}
	}

	public void gameLoop() {
		long startTime = System.currentTimeMillis();
		long cumulativeTime = startTime;

		while (running) {
			long timePassed = System.currentTimeMillis() - cumulativeTime;
			cumulativeTime += timePassed;
			update(timePassed);

			Graphics2D g = screen.getGraphics();
			draw(g);
			g.dispose();

			screen.update();

			try {
				Thread.sleep(20);
			} catch (Exception ex) {
			}
		}
	}

	// update animation
	public abstract void update(long timePassed);

	// draw
	public abstract void draw(Graphics2D g); 

	public void init() {
		screen = new ScreenManager();
		DisplayMode dm = screen.findFirstCompatibleMode(displayModes);
		screen.setFullScreen(dm);

		Window window = screen.getFullScreenWindow();
		window.setFont(new Font("Arial", Font.PLAIN, 20));
		window.setBackground(Color.LIGHT_GRAY);
		window.setForeground(Color.BLACK);

		running = true;
	}

}
