package ch14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListEx4 {
	public static void main(String[] args) {
		List<Person> li = new ArrayList<Person>();
		li.add(new Person("È«±æµ¿", 10));
		li.add(new Person("È«±æµ¿", 10));
		li.add(new Person("È«±æµ¿", 30));
		li.add(new Person("ÀÌÁ¤¹Î", 10));
		li.add(new Person("±èÀ±¹Î", 16));
		li.add(new Person("È«±æµ¿", 23));
		
		Person p1 = new Person("±è»ñ°«", 20);
		li.add(p1);
		System.out.println(li);
		Collections.sort(li, new Comparator<Person>() {
			
			@Override
			public int compare(Person o1, Person o2) {
				return (o1.name.compareTo(o2.name));
			}
		});	//¸Þ¼Òµå ±âÁ¸²¨ »ç¿ëµµ °¡´É
		System.out.println(li);
	}
	
	static <T> void sort(List<T> li, Comparator<T> c) {
		for (int i = 0; i < li.size()-1; i++) {
			for (int j = 0; j < li.size()-1-i; j++) {
				T p1 = li.get(j);
				T p2 = li.get(j+1);
				if (c.compare(p1, p2)>0) {
					li.set(j, p2);
					li.set(j+1, p1);
				}
			}
		}
	}
}
