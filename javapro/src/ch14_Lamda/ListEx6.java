package ch14_Lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListEx6 {
	public static void main(String[] args) {
		List<Person> li = new ArrayList<Person>();
		li.add(new Person("ȫ�浿",10));
		li.add(new Person("ȫ�浿",10));
		li.add(new Person("ȫ�浿",30));
		li.add(new Person("������",10));
		li.add(new Person("������",16));
		Person p1 = new Person("���", 20);
		li.add(p1);
		System.out.println(li);
		//����
		Comparator<Person> cp = (a,b) -> a.name.compareTo(b.name);
		Comparator<Person> cp2 = (a,b) -> b.age - a.age;
		Collections.sort(li, cp2);
		System.out.println(li);
		//�Ϲ� �͸� Ŭ����
		
		Collections.sort(li, new Comparator<Person>() {
			public int compare(Person o1, Person o2) {
				return (o1.name.compareTo(o2.name));
			};
		});
		System.out.println(li);
	}
}
