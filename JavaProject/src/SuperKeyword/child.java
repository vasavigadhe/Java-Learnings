package SuperKeyword;

public class child extends Parent{
	public child() {
		super(3);
		System.out.println("Child Constructor");
		
	}
	
	String EmpName = "kaveri";
	int i = 2;
	
	public static void main(String[] args) {
		child c = new child();
		c.getData();
	}
	public void  getData() {
		super.getData();
//		System.out.println(super.EmpName);
//		System.out.println(super.i);
	}

}
