import java.awt.Graphics2D;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyTest extends Core implements KeyListener {

	public static void main(String[] args) {
		new KeyTest().run();
	}
	
	private String message = "";
	
	// init also call init from superclass
	public void init() {
		super.init();
		Window window = screen.getFullScreenWindow();
		window.setFocusTraversalKeysEnabled(false); // sets tab to tab, not traverse
		window.addKeyListener(this); // makes window keylistener
		message = "Press escape to exit.";
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(long timePassed) {
		// TODO Auto-generated method stub
		
	}

}
