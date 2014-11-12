import java.awt.Image;

public class Sprite {

	private Animation animation;
	private float xPosition;
	private float yPosition;
	private float xVelocity;
	private float yVelocity;

	// Constructor
	public Sprite(Animation animation) {
		this.animation = animation;
	}

	// change position
	public void update(long timePassed) {
		xPosition += xVelocity * timePassed;
		yPosition += yVelocity * timePassed;
		animation.update(timePassed);
	}

	// Getter: x position
	public float getxPosition() {
		return xPosition;
	}

	// Setter: x position
	public void setxPosition(float xPosition) {
		this.xPosition = xPosition;
	}

	// Getter: y position
	public float getyPosition() {
		return yPosition;
	}

	// Setter: y position
	public void setyPosition(float yPosition) {
		this.yPosition = yPosition;
	}

	// Getter: x velocity
	public float getxVelocity() {
		return xVelocity;
	}

	// Setter: x velocity
	public void setxVelocity(float xVelocity) {
		this.xVelocity = xVelocity;
	}

	// Getter: y velocity
	public float getyVelocity() {
		return yVelocity;
	}

	// Setter: y velocity
	public void setyVelocity(float yVelocity) {
		this.yVelocity = yVelocity;
	}

	// Getter: sprite width
	public int getWidth() {
		return animation.getImage().getWidth(null);
	}

	// Getter: sprite height
	public int getHeight() {
		return animation.getImage().getHeight(null);
	}
	
	// Getter: sprite image
	public Image getImage() {
		return animation.getImage();
	}

}
