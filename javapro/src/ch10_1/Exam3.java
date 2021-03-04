package ch10_1;

class MyException1 extends Exception {
	MyException1(String msg) {
		super(msg);
	}
}
public class Exam3 {
	public static void main(String[] args) {
		try {
			method();
		} catch (MyException1 e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("error");
		}
	}
	private static void method() throws MyException1 {
		throw new MyException1("Exam3.method() 예외 강제 발생");
	}
}
