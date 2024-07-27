package javaPackage;

public class MethodsDemo {

	public static void main(String[] args) {
		MethodsDemo md = new MethodsDemo();
		md.login();
		md.logout();

	}
	public void login() {
		System.out.println("Login successfull");
	}
	public void logout() {
		System.out.println("Logout successfull");
	}
}
