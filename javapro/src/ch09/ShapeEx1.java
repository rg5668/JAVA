package ch09;

abstract class Shape {
	String type;
	Shape(String type) {
		this.type = type;
	}
	abstract double area();	//추상메서드
	abstract double length(); //추상메서드
}

class Circle extends Shape {
	int r;
	Circle(int r) {
		super("원");
		this.r = r;
	}
	@Override
	double area() {
		return Math.PI * r * r;
	}
	@Override
	double length() {
		return Math.PI * r * 2;
	}
	@Override
	public String toString() {
		return "Circle [r=" + r + ", type=" + type + "]" + ", 넓이:"
	+ area() + ", 둘레:" + length();
	}
	
}

class Rectangle extends Shape {
	int width, height;
	Rectangle(int width, int height) {
		super("사격형");
		this.width = width;
		this.height = height;
	}
	@Override
	double area() {
		return width * height;
	}
	@Override
	double length() {
		return 2 * (width * height);
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height
				+ ", type" + type + "]" + ", 넓이:" + area() + ", 둘레:"
				+ length();
	}
	
}
public class ShapeEx1 {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(5,5);
		for(Shape s : shapes) {
			System.out.println(s);
		}
	}
}
