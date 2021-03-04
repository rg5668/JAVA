package ch08;

class Parent {
	int x = 10;
	
	Parent(int x) {
		this.x = x;
	}
	Parent() {
		x = 400;
	}
}

class Child2 extends Parent {
	int x = 20;
	Child2() { } //default construtor ��������
	
//	Child2() {
//		super(100);	//�Ķ���� ���� Ÿ�Կ� �°� �����
//	}
	
	void method() {
		int x = 30;
		// x : 1.�������� => 2.���� Ŭ���� ��� �� x => �θ�Ŭ������ ��ü�� ��� �� x
		System.out.println(x);	//30
		//1.���� Ŭ������ ��� �� x => �θ�Ŭ������ ��ü�� ��� �� x
		System.out.println(this.x);	//20
		//�θ�Ŭ������ ��ü�� ��� �� x
		System.out.println(super.x);	//400
	}
}

public class SuperEx1 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}
}
