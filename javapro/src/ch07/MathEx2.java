package ch07;

class Math2{
	int a,b;	//�ν��Ͻ� ����
	int x;
	
	//�ν��Ͻ� �޼��� : ��ü�� �Ǿ�� �޼��� ȣ���� ������ 
	int add1() {
		for (int i = 0; i < 5; i++) {
			int x = 7;
		}
		System.out.println(x);
		return a+b;
	}
	//Ŭ���� �޼��� : Ŭ���� ���� �ε�ɶ� �޼����� ȣ���� ����
	static int add2(int a, int b) {
		int x = 5;
		System.out.println(x);
		return a+b;
	}
}
public class MathEx2 {
	public static void main(String[] args) { // Ŭ���� �޼���
		Math2 m = new Math2();
		m.a = 10;
		m.b = 20;
		System.out.println(m.add1());
		System.out.println(m.add2(100, 200));
		System.out.println(Math2.add2(100, 200));
	}
}
