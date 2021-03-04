package ch10;

interface I {
	void test();
}
abstract class Abs {
	abstract void test();
}
public class InnerEx4 {
	public static void main(String[] args) {
		int iv = 9999;
		
		I i = new I() {
			int iv = 100;
			
			@Override
			public void test() {
				int iv = 90;
				System.out.println("iv=" + iv);
				System.out.println("this.iv=" + this.iv);
				System.out.println("I 내부 클래스의 test 메서드");
			}
		};	i.test();
		
//		iv ++;	//final로 정의가 되어있음
		//무명의 내부 클래스는 지역내부클래스임.
		//지역내부클래스에서 사용되는 지역변수는 상수화가 필요함.
		Abs a = new Abs() {

			@Override
			void test() {
				System.out.println("iv=" + iv);
				System.out.println("Abs 내부 클래스의 test 메서드");
			}
		}; a.test();
	}
}