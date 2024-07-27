package tryCatch;

public class Example {

	public static void main(String[] args) {
		System.out.println("before division");
		try {
		int a = 5;
		System.out.println(a/0);
		}catch(Throwable t){
			System.out.println(t.getMessage());
			System.out.println(t.getStackTrace());
			System.out.println(t.fillInStackTrace());
			System.out.println(t.getLocalizedMessage());
			System.out.println(t.getSuppressed());
			System.out.println(t.hashCode());
			System.out.println(t.getCause());
			System.out.println(t.getClass());
		}finally {
			System.out.println("This is a final block");
		}
		System.out.println("after division");
		

	}

}
