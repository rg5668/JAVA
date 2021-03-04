package ch08;

//import java.awt.Rectangle;

public class Exam1 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width=10;
		r1.height=5;
		System.out.print("≥–¿Ã:");
		r1.area();
		System.out.print("µ—∑π:");
		r1.length();
		
		Rectangle r2 = new Rectangle();
		r2.width = 30;
		r2.height = 20;
		System.out.print("≥–¿Ã:");
		r2.area();
		System.out.print("µ—∑π:");
		r2.length();
	}
}

class Rectangle {
	int width;
	int height;
	public Rectangle() {
		
	}
	Rectangle(int width, int height) {
		this.width=width;
		this.height=height;
	}
	void area() {
		System.out.println(width*height);
		
	}
	void length() {
		System.out.println((width+height)*2); 
	}
}