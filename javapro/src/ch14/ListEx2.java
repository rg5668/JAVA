package ch14;

import java.util.List;
import java.util.Vector;

/*
 * Vector 예제 : Collection 프레임워크 이전에 사용되던 클래스.
 * 				List의 구현 클래스
 */
public class ListEx2 {
	public static void main(String[] args) {
		List<Double> list = new Vector<Double>();
		list.add(0.3);
		list.add(Math.PI);
//		list.addElement(5.0); Vector에만 있는 메서드. add와 같은 기능
		list.add(5.0);
		
		for(Object o : list) {
			System.out.println(o);
		}
		System.out.println("1:"+list);
		
		double num = 5.0;
		int index = list.indexOf(num);
		//없으면 -1 출력
		if(index >= 0) {
			System.out.println(num + "의 위치:" + index);
		} else {
			System.out.println(num + "은 list에 없습니다.");
		}
		
		num = 0.3;
		System.out.println(list.indexOf(num));//0
		System.out.println(list.indexOf(5.0));//2
		
		if(list.contains(num)) {//list의 요소 중 0.3인 데이터 존재?//문자열에 특정 문자열이 포함되어 있는지 확인하는 함수
//			list.removeElement(num);	//삭제
			list.remove(num);//삭제
			System.out.println(num + "삭제됨");
		}
		
		System.out.println("2:"+list);
		System.out.println(list.indexOf(num)); //-1(0.3은 없어서 -1)
		System.out.println(list.indexOf(5.0)); //1
		System.out.println(list);
	}
}
