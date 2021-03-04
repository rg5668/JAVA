package ch08;

public class CafeEx2 {
	public static void main(String[] args) {
		Dog d = new Dog();
		
		System.out.printf("이름:%s\n",d.name);
		System.out.printf("품종:%s\n",d.breeds);
		System.out.printf("나이:%s\n",d.age);
	}
}

class Dog {
	String name, breeds;
	int age;
	
	Dog(){
		name = "초코";
		breeds = "푸들";
		age = 4;
	}
}
