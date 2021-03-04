package ch10_1;

/*
 * throws 예외 처리
 * throws Exception를 처리한 메소드는 콜한 메소드에서 처리 하여야함
 * 단 RuntimeException은 처리 하지 않아도 됨
 */
public class ExcptionEx4 {
	public static void main(String[] args) {
		
		try {
			first();
		} catch (Exception e) {
			// TODO: handle exception
			//e.printStackTrace();
			System.out.println("예외처리");
		}
	}
	
	private static void first() throws Exception {
		second();
	}
	
	private static void second() throws Exception {
		System.out.println("second 메서드");
		// NumberFormatException 예외 발생
		System.out.println(Integer.parseInt("abc"));
	}
}
