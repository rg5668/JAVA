package ch03;

public class IntegerProblem {
	public static int addNormal(int base, int addThis) {
		return base + addThis;
	}
	
	public static int addSafety(int base, int addThis) {
		if ((Integer.MAX_VALUE - addThis) > base) {
			return base + addThis;
		} else {
			throw new ArithmeticException("오버플로우 발생");
		}
	}
	
	public static void main(String[] args) {
		int result = addNormal(Integer.MAX_VALUE, 1);
		System.out.println("일반 덧셈 결과: " + result);//맥벨+1
		
		try {
			result = addSafety(100, 100);
			System.out.println("안전한 덧셈 결과1: " + result);//200
			result = addSafety(Integer.MAX_VALUE, 100);
			System.out.println("안전한 덧셈 결과2: " + result);//오버플로우
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());//발생
		}
	}
}
