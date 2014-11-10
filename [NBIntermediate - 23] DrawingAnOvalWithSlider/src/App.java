import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;


public class App {

	public static void main(String[] args) {
		// display the window
		DrawOval myPanel = new DrawOval();
		JSlider slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);

		TheWindow window = new TheWindow(slider, myPanel);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(230,280);
		window.setVisible(true);
	}

}
