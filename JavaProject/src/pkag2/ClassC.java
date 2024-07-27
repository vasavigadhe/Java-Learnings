package pkag2;

import pkg1.*;

public class ClassC extends ClassA{

	public static void main(String[] args) {
		ClassA ca = new ClassA();
		ClassC cc = new ClassC();
//		cc.defaultmethod();
		cc.protectedmethod();
		

	}

}
