package paint;

public class Main {

	public static void main(String[] args) {
		Point point = new Point(10,10);
		//point.setX(10);
		//point.setY(10);
		
		drawPoint(point);
		point.show(false);
		//point.disapear();
	}
	public static void drawPoint(Point point) {
		point.show();
	}
}
