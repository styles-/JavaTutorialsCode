import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TheWindow extends JFrame {
	// panel goes in the frame
	private JSlider slider;
	private DrawOval myPanel;

	public TheWindow(final JSlider slider, final DrawOval myPanel) throws HeadlessException {
		super("Circle Slider"); // title for the window
		this.slider = slider;
		this.myPanel = myPanel;
		//myPanel = new DrawOval();
		this.myPanel.setBackground(Color.LIGHT_GRAY);
		
		// left and right slider
		//slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
		this.slider.setMajorTickSpacing(10); // ticks every 10 pixels
		this.slider.setPaintTicks(true); // show the ticks
		
		slider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				myPanel.setDiameter(slider.getValue());
			}
			
		});
		
		add(slider, BorderLayout.SOUTH);
		add(myPanel, BorderLayout.CENTER);
		
	}

}
