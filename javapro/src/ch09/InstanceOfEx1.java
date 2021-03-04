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
		if (p instanceof Child4) { //�ش�Ǵ� Child4 �ּҿ� Child4�� �ִ��� Ȯ���ϴ� ���� instanceof : false
			System.out.println("p �������� ��ü�� child3 ��ü��");
			Child4 c = (Child4)p;
			System.out.println(c.x);
			c.method();
		}
		if (p instanceof Parent4) {	//true
			System.out.println("p �������� ��ü�� Parent3 ��ü��");
		}
		//��� Ŭ������ Object Ŭ������ ��ӹ޴´�.
		//��� ��ü�� Object ��ü�� �����Ѵ�.
		//��� ��ü�� Object Ÿ���� ���������� ������ �����ϴ�.
		if (p instanceof Object) {	//true
			System.out.println("p �������� ��ü�� Object ��ü��");
			Object o = p;
			System.out.println(p.x);
			//System.out.println(o.x); //x�� object Ŭ������ ����� �ƴϴ�.
		}
	}
}
