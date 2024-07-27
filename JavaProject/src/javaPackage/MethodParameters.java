package javaPackage;

public class MethodParameters {

	public static void main(String[] args) {
		MethodParameters mp = new MethodParameters();
		mp.method1();
		method2();
		add(3,4);
		mp.diffp("It is a String", 12, false);

	}
	
	public void method1() {
		
	}
	public static void method2() {
		
	}
	public static int add(int x, int y) {
		System.out.println(x+y);
		return x+y;
		
	}
	public void diffp(String c, float d, boolean o) {
		System.out.println(c);
		System.out.println(d);
		System.out.println(o);
		
		
		
	}

}
