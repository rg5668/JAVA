package ch16;

import java.util.Arrays;
import java.util.List;

public class MatchEx1 {
	public static void main(String[] args) {
		List<Figure> list = Arrays.asList(
				new Rectangle(8,8), new Circle(5),new Rectangle(2,3));
		boolean result = list.stream().allMatch(a->(a instanceof Figure));//모든게 얘를 상속 받았냐.
		System.out.println("list 내부의 요소는 모두 Figure 객체인가?" + result);
		
		result = list.stream().anyMatch(a->(a instanceof Circle)); //모든것 중에 서클이 있는가
		System.out.println("list 내부의 요소에 Circle 객체가 존재하는가?" + result);
		
		result = list.stream().noneMatch(a->(a instanceof Rectangle)); //모든것 중에 렉탱글이 있으면 false
		System.out.println("list 내부에 요소의 객체는 Rectangle 객체가 아닌가?" + result);
	}
}

abstract class Figure {
	String type;
	public Figure(String type) {
		this.type = type;
	}
	public abstract double area();
	public abstract double length();
}
class Rectangle extends Figure {
    int w,h;
    Rectangle(int w, int h) {
    	super("사각형");
    	this.w = w;
    	this.h = h;
    }
	@Override
	public double area() {
		return w * h;
	}
	@Override
	public double length() {
		return (w+h) * 2;
	}
	@Override
	public String toString() {
		return "가로:"+w + ",높이:"+h + ",둘레:"+length()+",넓이:"+area();
	}
}
class Circle extends Figure {
	int r;
	Circle(int r) {
		super("원형");
    	this.r = r;
    }
	@Override
	public double area() {
		return Math.PI * r * r;
	}
	@Override
	public double length() {
		return Math.PI * 2 * r;
	}
	@Override
	public String toString() {
		return "반지름:"+r + ",둘레:"+length()+",넓이:"+area();
	}
}
