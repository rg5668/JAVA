package ch07;

class Math2{
	int a,b;	//인스턴스 변수
	int x;
	
	//인스턴스 메서드 : 객체와 되어야 메서드 호출이 가능함 
	int add1() {
		for (int i = 0; i < 5; i++) {
			int x = 7;
		}
		System.out.println(x);
		return a+b;
	}
	//클래스 메서드 : 클래스 정보 로드될때 메서드의 호출이 가능
	static int add2(int a, int b) {
		int x = 5;
		System.out.println(x);
		return a+b;
	}
}
public class MathEx2 {
	public static void main(String[] args) { // 클래스 메서드
		Math2 m = new Math2();
		m.a = 10;
		m.b = 20;
		System.out.println(m.add1());
		System.out.println(m.add2(100, 200));
		System.out.println(Math2.add2(100, 200));
	}
}
