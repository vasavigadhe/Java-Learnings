package encapsulation;

public class CreateCube {

	public static void main(String[] args) {
		CommonData cd = new CommonData();
//		int l = cd.length=-10;
//		int w = cd.width=9;
//		int h = cd.height=20;
		int l = cd.setLength(-10);
		int h = cd.setHeight(20);
		int w = cd.setWidth(-10);
		
		cd.SetBoxDimension(l, w, h);
		
		
		
	}

}
