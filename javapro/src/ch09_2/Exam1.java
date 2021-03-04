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
		super("비둘기");
	}
	@Override
	public void fly() {
		System.out.println(name + "는 날라다니는 새입니다.");
	}
	@Override
	void eat() {
		System.out.println(name + "는 벌레를 잡아먹는다.");
	}
}
class Monkey extends Animal {

	Monkey() {
		super("원숭이");
	}
	@Override
	void eat() {
		System.out.println(name + "는 나무에서 열매를 따먹는다.");
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
