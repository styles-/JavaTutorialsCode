import java.awt.Graphics;

import javax.swing.JApplet;


public class App extends JApplet {
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("Wow this actually worked?", 25, 25);
	}
	
}
