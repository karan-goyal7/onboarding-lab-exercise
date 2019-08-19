package org.tektutor;

public class Mobile {
	
	
	private Camera camera;
	
	public Mobile() {
		camera = new Camera();
	}
	
	public Mobile(Camera camera) {
		this.camera = camera;
	}

	public boolean startPhototApp() {
		System.out.println("Inside start photo app method");
		
		
		if(camera.on()) {
			System.out.println("Positive code path");
			System.out.println("Some Hardware interaction happen here");
			return true;
		}
		System.out.println("Negative code path");
		System.out.println("Assume exception handling and error log happens here");
		return false;
	}

}
