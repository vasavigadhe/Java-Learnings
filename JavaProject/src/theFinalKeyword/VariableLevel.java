package theFinalKeyword;

public class VariableLevel 
//extends MethodLevel
{
	public final int a = 10;
	public static void main(String[] args) {
		VariableLevel vl = new VariableLevel();
		System.out.println(vl.a);
		vl.method();
//		vl.a = 11;
//		System.out.println(vl.a);
	}
	public void method() {
		System.out.println("child class");     //applying inheritance and checking final in method level
	}

}
