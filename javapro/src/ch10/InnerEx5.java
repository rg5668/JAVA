package ch10;

class I11 {
	int iv = 100;
	public void test1() {
		int iv = 90;
		System.out.println("iv=" + iv);
		System.out.println("this.iv=" + this.iv);
		System.out.println("I ���� Ŭ������ test �޼���");
	}
}
 class Abs11 {
	int iv = 9999;
	void test1() {
		System.out.println("iv=" + iv);
		System.out.println("Abs ���� Ŭ������ test �޼���");
	}
}
public class InnerEx5 {
	public static void main(String[] args) {
		
		I11 i = new I11();
		i.test1();
		
		Abs11 a = new Abs11();
		a.test1();
	}
}