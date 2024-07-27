package pkg1;

public class ClassA {
	//class ClassA{}
	public int publicvariable =1;
	int defaultvariable = 2;
	private int privatevariable = 3;
	protected int protectedvariable =4;
	
	public static void main(String[] args) {
		ClassA ca = new ClassA();
		ca.privatemethod();
	}
	
	public void publicmethod() {
		System.out.println("Pubic method");
	}
	void defaultmethod() {
	    System.out.println("Default method");
	}
	private void privatemethod() {
		System.out.println("Private Method");
	}
	protected void protectedmethod() {
		System.out.println("Protected Method");
	}
	
	
}
