package ch08;

class Rectangle3 {
	int width, height, seriaNo;
	static int sno;
	
	Rectangle3 (int w, int h) {
		width = w;
		height = h;
		seriaNo = ++sno;
	}
	
	int area() {
		return width * height;
	}
	int length() {
	      return (width+height)*2;
	}
	boolean isSquare() {
		return width == height;
	}
	void info() {
		System.out.println(seriaNo+"���簢��:("+width +","+ height +
				") ���� :" + area() + "," + "�ѷ� :" + length() + 
				(isSquare()?"���簢��" : "���簢��"));
	}
}

public class Exam6 {
	public static void main(String[] args) {
		Rectangle3[] recarr = new Rectangle3[3];
		recarr[0] = new Rectangle3(10,10);
		recarr[1] = new Rectangle3(20,10);
		recarr[2] = new Rectangle3(25,25);
		for(Rectangle3 r : recarr) {
			r.info();
		}
	}
}
