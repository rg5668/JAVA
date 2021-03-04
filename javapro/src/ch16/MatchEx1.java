package ch16;

import java.util.Arrays;
import java.util.List;

public class MatchEx1 {
	public static void main(String[] args) {
		List<Figure> list = Arrays.asList(
				new Rectangle(8,8), new Circle(5),new Rectangle(2,3));
		boolean result = list.stream().allMatch(a->(a instanceof Figure));//���� �긦 ��� �޾ҳ�.
		System.out.println("list ������ ��Ҵ� ��� Figure ��ü�ΰ�?" + result);
		
		result = list.stream().anyMatch(a->(a instanceof Circle)); //���� �߿� ��Ŭ�� �ִ°�
		System.out.println("list ������ ��ҿ� Circle ��ü�� �����ϴ°�?" + result);
		
		result = list.stream().noneMatch(a->(a instanceof Rectangle)); //���� �߿� ���ʱ��� ������ false
		System.out.println("list ���ο� ����� ��ü�� Rectangle ��ü�� �ƴѰ�?" + result);
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
    	super("�簢��");
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
		return "����:"+w + ",����:"+h + ",�ѷ�:"+length()+",����:"+area();
	}
}
class Circle extends Figure {
	int r;
	Circle(int r) {
		super("����");
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
		return "������:"+r + ",�ѷ�:"+length()+",����:"+area();
	}
}
