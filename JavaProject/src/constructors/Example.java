package constructors;

public class Example {
	public Example() {
		System.out.println("No arguments");
	}
	
	public Example(int a) {
		System.out.println("arguments");
	}
	
	public Example(int i, String s) {
		System.out.println("Arguments with integer and string");
	}

	public static void main(String[] args) {
		Example e = new Example();
		Example h = new Example(2);
		Example i = new Example(2,"k");
		

	}

}
