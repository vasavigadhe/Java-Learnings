package SuperKeyword;

public class Parent {
	
	public Parent() {
		System.out.println("Parent Constructor");
	}
	public Parent(int a) {
		System.out.println(a);
	}
	
	String EmpName = "rajesh";
	int i = 5;
	
	public static void main(String[] args) {
		

	}
	public void getData() {
		System.out.println(EmpName);
		System.out.println(i);
	}

}
