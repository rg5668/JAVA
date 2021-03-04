package ch14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {
		//<Integer> : 제네릭표현
		//List<Integer> : Integer 객체를 리스트에 저장함.
		//ArrayList : 가변배열. 저장할 갯수를 몰라도 객체를 저장.
		//				첨자 사용가능
		List<Integer> list = new ArrayList<Integer>();
		list.add(1); list.add(2); list.add(5); list.add(4);
		list.add(3); list.add(0); list.add(0); list.add(4);
		System.out.println(list);	//순서대로 저장 중복 가능
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		//list.subList(1,4)// : list객체의 1번인덱스부터 3번인덱스까지 부분리스트로 리턴
		
		//list 1부터 4전까지 (1~3)
		List<Integer> list2 = new ArrayList<Integer>(list.subList(1, 4));
		System.out.println(list2);
		//list2를 정렬	list 1부터 4전까지 (1~3)
		//Collections : Collection 프로임워크에 관련된 추가 기능을 멤버로 가진 클래스
		//List는 Comparable을 상속받아서 자동으로 정렬
		Collections.sort(list2);	//정렬
		System.out.println(list2);
	}
}
