class Machine{
	public void start(){
		System.out.println("Machine started.");
	}
}

class Camera extends Machine{
	public void start(){
		System.out.println("Camera started.");
	}
	public void snap(){
		System.out.println("Photo taken.");
	}
}

public class UpDownCastingTut {
	public static void main(String[] args) {
		Machine mach1 = new Machine();
		Camera cam1 = new Camera();
		
		mach1.start();
		cam1.start();
		cam1.snap();
		
		// Upcasting
		Machine mach2 = cam1;
		mach2.start();
		//mach2.snap(); variable determines methods you can call, Machine() only has start() method
		
		// Downcasting
		Machine mach3 = new Camera();
		Camera cam2 = (Camera) mach3;
		cam2.start();
		cam2.snap();
		
		// downcasting inherently unsafe
		
		/* doesn't work, runtime error
		Machine mach4 = new Machine();
		Camera cam3 = (Camera) mach4;
		cam3.start();
		cam3.snap();*/
	}
}
