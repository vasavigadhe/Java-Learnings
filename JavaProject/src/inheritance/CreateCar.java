package inheritance;

public class CreateCar extends VehicleClass{

	public static void main(String[] args) {
		CreateCar cc = new CreateCar();
		cc.start();
		cc.stop();

	}
	
	public void FourSeater() {
		System.out.println("It's a Four Seater");
	}

}
