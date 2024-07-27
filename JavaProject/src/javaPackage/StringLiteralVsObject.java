package javaPackage;

public class StringLiteralVsObject {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Vasavi";
		String str1 = "Vasavi";
		String str2 = new String("Vasavi");
		System.out.println(str==str2);
		System.out.println(str.equals(str2));
		
	}

}
