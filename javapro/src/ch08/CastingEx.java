package ch08;

public class CastingEx {
	public static void main(String[] args) {
		//Parent1 p = new Parent1(); //���� ����
		Parent1 p = new Child1();	//Ŭ���� �θ� ���� = �ڽ�	//extends �� �ڽ��� �θ� ���� �Ҵ��� ����
		Parent1 p2 = null;
		Child1 c = null;
		p.drive();
		c = (Child1) p;		//�θ� �ڽ����� �Ҵ��ϴ°� �ȵ� �Ϸ��� ĳ������ �������(�ּҸ� ��ã��)
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
