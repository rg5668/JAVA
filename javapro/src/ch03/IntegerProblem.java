package ch03;

public class IntegerProblem {
	public static int addNormal(int base, int addThis) {
		return base + addThis;
	}
	
	public static int addSafety(int base, int addThis) {
		if ((Integer.MAX_VALUE - addThis) > base) {
			return base + addThis;
		} else {
			throw new ArithmeticException("�����÷ο� �߻�");
		}
	}
	
	public static void main(String[] args) {
		int result = addNormal(Integer.MAX_VALUE, 1);
		System.out.println("�Ϲ� ���� ���: " + result);//�ƺ�+1
		
		try {
			result = addSafety(100, 100);
			System.out.println("������ ���� ���1: " + result);//200
			result = addSafety(Integer.MAX_VALUE, 100);
			System.out.println("������ ���� ���2: " + result);//�����÷ο�
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());//�߻�
		}
	}
}
