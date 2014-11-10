import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawOval extends JPanel {
	private int diameter = 10;
	
	public void paintComponent(Graphics g) {
		// whatever you extend becomes super class
		super.paintComponent(g);
		g.fillOval(10, 10, diameter, diameter);
	}
	
	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = (diameter >= 0 ? diameter : 10);
		repaint();
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(200,200);
	}
	
	public Dimension getMinimumSize() {
		return getPreferredSize();
	}
}
