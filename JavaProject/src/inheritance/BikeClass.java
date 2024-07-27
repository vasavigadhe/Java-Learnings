package inheritance;

public class BikeClass extends VehicleClass{

	public static void main(String[] args) {
		BikeClass bc = new BikeClass();
		bc.start();
		bc.stop();

	}
	public void Battery() {
		System.out.println("Battery");
	}

}
