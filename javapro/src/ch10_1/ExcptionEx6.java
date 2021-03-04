package ch10_1;

/*
 * throws 예외 처리 : 발생된 예외를 상위 method에 전달하기.
 * throw : new 예외발생 : 예외 강제 발생
 */
public class ExcptionEx6 {
	public static void main(String[] args) {
		try {
			throw new Exception("예외 강제 발생");
		} catch (Exception e) {
			System.out.println("예외 강제 발생2");
		}
	}
}
