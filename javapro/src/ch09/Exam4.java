package ch09;

abstract class Animal {
	String type;
	int leg;
	
	Animal(String type, int leg) {
		this.type = type;
		this.leg = leg;
	}
	abstract void eat();
	abstract void sound();
	abstract void legs();
}

class Dog extends Animal {
	Dog() {
		super("Dog", 4);
	}

	@Override
	void eat() {
		System.out.println("������ �ִ´�� �Դ´�");
	}

	@Override
	void sound() {
		System.out.println("�۸�");
	}

	@Override
	void legs() {
		System.out.println("�ٸ��� " + leg);
	}
}

class Lion extends Animal {
	Lion() {
		super("Lion",4);
	}

	@Override
	void eat() {
		System.out.println("�ʽĵ����� ��� �Դ´�");
	}

	@Override
	void sound() {
		System.out.println("����");
	}
	
	@Override
	void legs() {
		System.out.println("�ٸ��� " + leg);
	}
}

class Cat extends Animal {
	Cat() {
		super("Cat",4);
	}

	@Override
	void eat() {
		System.out.println("������ �ذ��� �Դ´�");
	}

	@Override
	void sound() {
		System.out.println("�߿�");
	}
	
	@Override
	void legs() {
		System.out.println("�ٸ��� " + leg);
	}
}
public class Exam4 {
	public static void main(String[] args) {
		Animal[] animal = new Animal[3];
		animal[0] = new Dog();
		animal[1] = new Lion();
		animal[2] = new Cat();
		
		for (Animal a : animal) {
			System.out.print(a.type + "=>");
			a.sound();
			a.eat();
			a.legs();
		}
	}
}
