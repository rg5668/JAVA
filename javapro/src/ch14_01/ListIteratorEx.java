package ch14_01;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/*
 * Iterator 는 한방향으로만 접근
 * ListIterator 는 양방향으로 접근(역순 출력가능)
 */
public class ListIteratorEx {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		for (int i = 1; i <= 5; i++) {
			list.add(i*100);
		}
		
		ListIterator lit = list.listIterator();
			
		while (lit.hasNext()) {//hasNext 다음 값이 있으면 true
			System.out.println(lit.next());//next로 꺼내기
		}
			
		System.out.println("========================");
		
		//역방향 순회할떄 hasPrevious
		while(lit.hasPrevious()) {//hasPrevious 전에 값이 있으면 true
			System.out.println(lit.previous());//previous로 출력
		}
	}
}
