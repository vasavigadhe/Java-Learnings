package inheritance;

public class VehicleClass {

	public static void main(String[] args) {
		VehicleClass vc = new VehicleClass();
		vc.start();
		vc.stop();

	}
	public void start() {
		System.out.println("Vehicle has started");
	}
	public void stop() {
		System.out.println("Vehicle has Stopped");
	}

}
