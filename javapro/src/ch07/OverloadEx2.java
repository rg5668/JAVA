package ch07;

class Math4 {
	int add(int a, int b) {
		System.out.print("int int �޼��� ���:");
		return a + b;
	}
//	int add(int x, int y) {
//		System.out.print("int int �޼��� ���:");
//		return x + y;
//	}
	long add(long a, int b) {
		System.out.print("long int �޼��� ���:");
		return a + b;
	}
	long add(int a, long b) {
		System.out.print("int long �޼��� ���:");
		return a + b;
	}
	long add(long a, long b) {
		System.out.print("long long �޼��� ���:");
		return a + b;
	}
}
public class OverloadEx2 {
	public static void main(String[] args) {
		Math4 m = new Math4();
		System.out.println(m.add(10, 10));
		System.out.println(m.add(10, 10L));
		System.out.println(m.add(10L, 10));
		System.out.println(m.add(10L, 10L));
	}
}
