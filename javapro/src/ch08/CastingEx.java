package ch08;

public class CastingEx {
	public static void main(String[] args) {
		//Parent1 p = new Parent1(); //실행 오류
		Parent1 p = new Child1();	//클래스 부모 변수 = 자식	//extends 시 자식이 부모에 들어가는 할당이 가능
		Parent1 p2 = null;
		Child1 c = null;
		p.drive();
		c = (Child1) p;		//부모가 자식한테 할당하는건 안됨 하려면 캐스팅을 해줘야함(주소를 못찾음)
		c.drive();
		p2 = c;
		p2.drive();
		
		c.water();
	}
}

class Parent1 {
	String color;
	int door;
	void drive() {
		System.out.println("drive, Brrrrrr~");
	}
	void stop() {
		System.out.println("stop!!!");
	}
}

class Child1 extends Parent1 {
	void water() {
		System.out.println("water!!!!!!!!!!!!!!");
	}
}
