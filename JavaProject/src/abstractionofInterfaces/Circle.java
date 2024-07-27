package abstractionofInterfaces;

public class Circle implements Shape{

	public static void main(String[] args) {
		Circle c = new Circle();
		c.drawingShape();
		c.coloringShape();
		c.movingShape();
	}
	@Override
	public void drawingShape() {
		System.out.println("drawing shape");
		
	}

	@Override
	public void coloringShape() {
		System.out.println("coloring shape");
		
	}

	@Override
	public void movingShape() {
		System.out.println("moving shape");
	}
		
}
