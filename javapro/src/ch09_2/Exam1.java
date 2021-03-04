package ch09_2;

abstract class Animal {
	String name;
	Animal(String name) {
		this.name = name;
	}
	abstract void eat();
}
interface Flyable {
	abstract void fly();
}
class Dove extends Animal implements Flyable {
	Dove() {
		super("��ѱ�");
	}
	@Override
	public void fly() {
		System.out.println(name + "�� ����ٴϴ� ���Դϴ�.");
	}
	@Override
	void eat() {
		System.out.println(name + "�� ������ ��ƸԴ´�.");
	}
}
class Monkey extends Animal {

	Monkey() {
		super("������");
	}
	@Override
	void eat() {
		System.out.println(name + "�� �������� ���Ÿ� ���Դ´�.");
	}
	
}
public class Exam1 {
	public static void main(String[] args) {
		Animal a = new Dove();
		a.eat();
		if (a instanceof Flyable) {
			Flyable f = (Flyable) a;
			f.fly();
		}
		a = new Monkey();
		a.eat();
		
		if (a instanceof Flyable) {
			((Flyable)a).fly();
		}
	}
}
