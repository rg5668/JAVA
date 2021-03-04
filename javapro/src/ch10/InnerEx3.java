package ch10;

class Outer3 {
	int iv = 10;
	int iv2 = 20;
	
	class InstanceInner {
		int iv = 100;
		
		void method1() {
			int iv = 300;
			
			System.out.println("iv=" + iv);
			System.out.println("this.iv=" + this.iv);
			//Outer3.this.iv : Outer3 클래스의 멤버 변수 iv 값
			this.iv = 50;
			System.out.println("this.iv2=" + this.iv);
			System.out.println("Outer3.this.iv=" + Outer3.this.iv);
		}
	}
}
public class InnerEx3 {
	public static void main(String[] args) {
		Outer3 out = new Outer3();
		Outer3.InstanceInner ii = out.new InstanceInner();
//		Outer3.InstanceInner ii2 = new Outer3().new InstanceInner(); //이렇게도 사용 가능
		ii.method1();
	}
}
