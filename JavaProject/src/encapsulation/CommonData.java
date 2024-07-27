package encapsulation;

public class CommonData {
	private int length;
	private int width;
	private int height;
	
	
	public static void main(String[] args) {
		CommonData cd = new CommonData();
		cd.SetBoxDimension(-10,20,30);

	}

	public void SetBoxDimension(int l,int b,int h) {
		if(l >= 1 || b >= 1 || h >= 1) {
			System.out.println("Invalid dimensions");
		}else {
		System.out.println("Length is "+l +" width is "+b+" height is "+h);
	}
	}
	public int setLength(int l) {
		if( l >= 1) {
			length = l;
			
		} else {
			System.out.println("Invalid Length");
		}
		return length;
		
	}
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}

	public int setWidth(int w) {
		if( w >= 1) {
			width = w;
			
		} else {
			System.out.println("Invalid width");
		}
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int setHeight(int h) {
		if( h >= 1) {
			height = h;
			
		} else {
			System.out.println("Invalid height");
		}
		return height;
	}
	
}
