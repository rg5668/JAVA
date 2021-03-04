package ch10;
/*
 * finally 구문 : 정상 실행, 예외실행 모두 실행됨
 * 				try, catch 구문에서 return 문장을 만나도 finally는 실행됨.
 */
public class ExceptionEx3 {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3/0);
			//return; //메서드 종료
		} catch (Exception e) {
			System.out.println(4);
			return;	//메서드 빠져나와서 종료되도 finally는 실행됨
		} finally {
			System.out.println("finally:" + 5);
		}
		System.out.println(6);
	}
}
