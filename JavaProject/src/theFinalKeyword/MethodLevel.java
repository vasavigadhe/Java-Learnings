package theFinalKeyword;

public final class MethodLevel {

	public static void main(String[] args) {
		MethodLevel ml = new MethodLevel();
		ml.method();
	}
	public final void method() {
		System.out.println("Parent Class");     //applying inheritance
	}

}
