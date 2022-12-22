package paint;

public class Main {

	public static void main(String[] args) {
		Point point1 = new Point(10,10);
		//point1.setX(10);
		//point1.setY(10);
		
//		drawPoint(point1);
		//point1.disapear();
		draw(point1);
		point1.show(false);
		
		Point point2 = new ColorPoint(20,20,"red");
//		point2.setX(20);
//		point2.setY(20);
//		((ColorPoint)point2).setColor("red");
//		drawPoint(point2);
		draw(point2);
		
		Rect rect = new Rect();
		//drawRect(rect);
//		drawShape(rect);
		draw(rect);
		
		Triangle triangle = new Triangle();
		//drawTriangle(triangle);
//		drawShape(triangle);
		draw(triangle);
		
		Circle circle = new Circle();
//		drawShape(circle);
		draw(circle);
	}
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
//	public static void drawPoint(Point point) {
//		point.show();
//	}
//	public static void drawColorPoint(ColorPoint colorPoint) {
//		colorPoint.show();
//	}
	
//	public static void drawShape(Shape shape) {
//		shape.draw();
//	}
	
//	public static void drawRect(Rect rect) {
//		rect.draw();
//	}
//	public static void drawTriangle(Triangle triangle) {
//		triangle.draw();
//	}
//	public static void drawCircle(Circle circle) {
//		circle.draw();
//	}
}
