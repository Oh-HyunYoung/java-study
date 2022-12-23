package prob6;

public class RectTriangle extends Shape{
		private double width;
		private double height;
		
	public RectTriangle(double w, double h) {
		this.width = w;
		this.height = h;
	}
	@Override
	public double getArea() {
		return (width*height*0.5);
	}
	@Override
	public double getPerimeter() {
		return (width+height)+Math.sqrt((width*width)+(height*height));
	}

}
