package ch08;

public class CafeEx2 {
	public static void main(String[] args) {
		Dog d = new Dog();
		
		System.out.printf("�̸�:%s\n",d.name);
		System.out.printf("ǰ��:%s\n",d.breeds);
		System.out.printf("����:%s\n",d.age);
	}
}

class Dog {
	String name, breeds;
	int age;
	
	Dog(){
		name = "����";
		breeds = "Ǫ��";
		age = 4;
	}
}
