package ch13;

public class GenericEx08_1 {
	public static void main(String[] args) {
		MyArrayList<Student> t1 = new MyArrayList<Student>();
		t1.add(new Student(18, "±èÀÚ¹Ù"));
		t1.add(new Student(25, "¹ÚÀÚ¹Ù"));
		t1.add(new Student(12, "³ª¸ô¶ó"));
		System.out.println(t1.get(2));
		t1.list();
	}
}

class Student {
	int age;
	String name;
	
	Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return age + ":" + name;
	}
}
