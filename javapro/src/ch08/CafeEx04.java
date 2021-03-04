package ch08;

class Animal1 {
	String name;
	int age;
	
	Animal1(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return this.name + ":" + this.age;
	}
}

public class CafeEx04 {
	public static void main(String[] args) {
		Animal1 a = new Animal1("¿ø¼þÀÌ", 26);
		System.out.println(a);
	}
}
