package ch10_1;

public class ExcptionEx7 {
	public static void main(String[] args) {
		try {
			badmethod();
		} catch (Exception e) {
			System.out.println("main 에서 예외 처리");
//			e.printStackTrace();	//예외처리가 뭘로 됬는지 보여줌
			// TODO: handle exception
		}
	}
	private static void badmethod() throws Exception {
		try {
			throw new Exception("예외 강제 발생");
		} catch (Exception e) {
			System.out.println("badmethod 에서 예외 처리");
//			e.printStackTrace();
			throw e;	//다시 메인으로 올라감
			// TODO: handle exception
		}
	}
}
