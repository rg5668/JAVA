package ch14_01;

import java.util.ArrayList;
import java.util.Iterator;
/*
 * Iterator
 * it.hasNext() : ������ �Էµ� �ּ� ������ true
 * it.next()	: ���� �ּ� return
 */
public class IteratorEx1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
//			Object obj = it.next();
			System.out.println(it.next());
		}
		System.out.println("==============");
		for (Object o : list) {
			System.out.println(o);
		}
		System.out.println("==============");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
