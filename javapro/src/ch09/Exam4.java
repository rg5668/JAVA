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
		System.out.println("주인이 주는대로 먹는다");
	}

	@Override
	void sound() {
		System.out.println("멍멍");
	}

	@Override
	void legs() {
		System.out.println("다리는 " + leg);
	}
}

class Lion extends Animal {
	Lion() {
		super("Lion",4);
	}

	@Override
	void eat() {
		System.out.println("초식동물을 잡아 먹는다");
	}

	@Override
	void sound() {
		System.out.println("어흥");
	}
	
	@Override
	void legs() {
		System.out.println("다리는 " + leg);
	}
}

class Cat extends Animal {
	Cat() {
		super("Cat",4);
	}

	@Override
	void eat() {
		System.out.println("주인이 준것을 먹는다");
	}

	@Override
	void sound() {
		System.out.println("야옹");
	}
	
	@Override
	void legs() {
		System.out.println("다리는 " + leg);
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
