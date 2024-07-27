package polymorphism;

public class MethodOverloading {
    //Login an Application
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.login(123456789L, "sdfghjk");
		mo.login("asdfghjk", "asyudfgh");
		mo.login("dfg", "asdfghjk", 4567);

	}
	
	public void login(String Username, String Pass) {
		 System.out.println("Login Successful using username and password");
	}
	
	public void login(Long PhnNumber, String Pass) {
		 System.out.println("Login Successful using PhoneNumber and password");
	}

	public void login(String Username, String Pass, int pin) {
		 System.out.println("Login Successful using username, password and pin");
	}
}
