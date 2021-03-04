package ch09;
//추상 클래스간의 상속도 가능함.
//추상클래스가 자손 클래스인 경우 보모의 추상 메서드를 재정의 안해도됨
//단 추상 클래스를 상속받은 일반 클래스는 모든 추상 메서드를 구현해야 함.
abstract class Abs1 {
	int a = 10;
	protected abstract int getA();
}
abstract class Abs2 extends Abs1 {
	int b = 20;
	protected abstract int getB();
}
class Normal extends Abs2 {
	@Override
	protected int getB() {
		return b;
	}
	@Override
	protected int getA() {
		return a;
	}
}
public class AbstractEx1 {
	public static void main(String[] args) {
		Abs1 a1 = new Normal();
		System.out.println(a1.getA()); // 10
		//System.out.println(a1.getB()); //error
		
		Abs2 a2 = (Abs2) a1;
		System.out.println(a2.getA());
		System.out.println(a2.getB());
		
		Normal n = (Normal) a2;
		System.out.println(n.getA());
		System.out.println(n.getB());
		
		Normal n1 = new Normal();
		System.out.println(n1.getA());
		System.out.println(n1.getB());
		//a2 = new Abs2(); //error. 추상 클래스는 객체화 불가
	}
}
