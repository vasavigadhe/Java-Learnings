package polymorphism;

public class Dog extends Animal{

	public static void main(String[] args) {
		Dog d = new Dog();
		d.MakesNoise();

	}
	public void MakesNoise() {
		System.out.println("Dog Barks");
	}

}
