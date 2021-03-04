package ch08;


class Circle{
	double r;
	int x, y, no;
	static int count;
	
	Circle (int r, int x, int y) {
		this.r = r; this.x = x; this.y = y; 
		no = ++ count;
	}
	Circle (int x, int y) {
		this(1,x,y);
	}
	Circle (int r) {
		this(r,1,1);
	}
	double area () {
		return Math.PI*(r*r);
	}
	double length () {
		return 2*Math.PI*r;
	}
	void move (int a, int b) {
		x += a;
		y += b;
	}
	void scale(double m) {
		r = r * m;
	}
	@Override
	public String toString() {
		/*return
				no + "���� : ������ : " +r+","+"��ǥ : (" + x+","+y+"), ���� :"
				+ area() + ", �ѷ� :" + length();
		*/
		return String.format("%d����=>������:%.0f, ��ǥ(%d,%d), ����:%.3f" 
				+ "�ѷ� : %.3f", no,r,x,y,area(),length());
	}
}

public class Exam7 {
	public static void main(String[] args) {
		Circle[] carr = new Circle[3];
		carr[0] = new Circle(10,10,10);
		carr[1] = new Circle(20,20);
		carr[2] = new Circle(100);
		for(Circle c : carr) {
			System.out.println(c);
			c.move(10, 10);
			System.out.println(c);
			c.scale(3);
			System.out.println(c);
		}
	}
}
