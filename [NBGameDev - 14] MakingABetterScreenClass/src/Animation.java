import java.awt.Image;
import java.util.ArrayList;

public class Animation {

	private ArrayList<OneScene> scenes;
	private int sceneIndex;
	private long movieTime;
	private long totalTime;

	public Animation() {
		scenes = new ArrayList<OneScene>();
		totalTime = 0;
		start();
	}

	public synchronized void start() {
		movieTime = 0;
		sceneIndex = 0;
	}

	public synchronized void addScene(Image image, long time) {
		totalTime += time;
		scenes.add(new OneScene(image, totalTime));
	}

	public synchronized void update(long timePassed) {
		if (scenes.size() > 1) {
			movieTime += timePassed;

			if (movieTime >= totalTime) {
				movieTime = 0;
				sceneIndex = 0;
			}
			
			while (movieTime > getScene(sceneIndex).endTime) {
				sceneIndex++;
			}
		}
	}

	private OneScene getScene(int index) {
		return scenes.get(index);
	}
	
	public synchronized Image getImage() {
		if (scenes.size() == 0) {
			return null;
		} else {
			return getScene(sceneIndex).pic;
		}
	}
	
	// private inner class //
	private class OneScene {

		public Image pic;
		public long endTime;
		
		public OneScene(Image pic, long endTime) {
			this.pic = pic;
			this.endTime = endTime;
		}
		
	}
}
