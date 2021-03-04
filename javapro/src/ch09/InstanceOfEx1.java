package ch09;

class Parent4 {
	int x = 10;
}
class Child4 extends Parent4 {
	int x =20;
	void method() {
		System.out.println("child method");
	}
}
public class InstanceOfEx1 {
	public static void main(String[] args) {
		Parent4 p = new Parent4();
		if (p instanceof Child4) { //해당되는 Child4 주소에 Child4가 있는지 확인하는 변수 instanceof : false
			System.out.println("p 참조변수 객체는 child3 객체다");
			Child4 c = (Child4)p;
			System.out.println(c.x);
			c.method();
		}
		if (p instanceof Parent4) {	//true
			System.out.println("p 참조변수 객체는 Parent3 객체다");
		}
		//모든 클래스는 Object 클래스를 상속받는다.
		//모든 객체는 Object 객체를 포함한다.
		//모든 객체는 Object 타입의 참조변수로 참조가 가능하다.
		if (p instanceof Object) {	//true
			System.out.println("p 참조변수 객체는 Object 객체다");
			Object o = p;
			System.out.println(p.x);
			//System.out.println(o.x); //x는 object 클래스의 멤버가 아니다.
		}
	}
}
