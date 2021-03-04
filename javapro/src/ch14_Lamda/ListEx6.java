package ch14_Lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListEx6 {
	public static void main(String[] args) {
		List<Person> li = new ArrayList<Person>();
		li.add(new Person("È«±æµ¿",10));
		li.add(new Person("È«±æµ¿",10));
		li.add(new Person("È«±æµ¿",30));
		li.add(new Person("ÀÌÁ¤¹Î",10));
		li.add(new Person("±èÀ±¹Î",16));
		Person p1 = new Person("±è»ñ°«", 20);
		li.add(p1);
		System.out.println(li);
		//¶÷´Ù
		Comparator<Person> cp = (a,b) -> a.name.compareTo(b.name);
		Comparator<Person> cp2 = (a,b) -> b.age - a.age;
		Collections.sort(li, cp2);
		System.out.println(li);
		//ÀÏ¹Ý ÀÍ¸í Å¬·¡½º
		
		Collections.sort(li, new Comparator<Person>() {
			public int compare(Person o1, Person o2) {
				return (o1.name.compareTo(o2.name));
			};
		});
		System.out.println(li);
	}
}
