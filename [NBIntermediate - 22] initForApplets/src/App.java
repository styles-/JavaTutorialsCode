import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JOptionPane;


public class App extends JApplet {
	private double sum;

	@Override
	public void init() {
		String firstNum = JOptionPane.showInputDialog("Enter first number");
		String secondNum = JOptionPane.showInputDialog("Enter second number");
		
		double num1 = Double.parseDouble(firstNum);
		double num2 = Double.parseDouble(secondNum);
		
		sum = num1 + num2;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("The sum is " + sum, 25, 30);
	}
	
}
