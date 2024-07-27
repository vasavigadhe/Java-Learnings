package pkg1;
public class ClassB extends ClassA {

	public static void main(String[] args) {
		ClassA ca = new ClassA();
		ClassB cb = new ClassB();
		ca.defaultmethod();
		cb.defaultmethod();
		cb.protectedmethod();
		
	}
	public void MethodB() {
		System.out.println("this is a methoad in Class B");
	}

}
