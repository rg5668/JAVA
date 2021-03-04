package ch15;

import java.util.Arrays;
import java.util.List;

public class PeekEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("aaa","bbb","ccc");
		System.out.println("결과 출력 없음");
//		double totSum2  = 
		list.stream()
		.mapToInt(a -> a.length())
		.peek(a -> System.out.println(a));
		//최종처리가 없어서 안찍힘.
//		.sum();
//		System.out.println(totSum2);
		
		//최종처리가 있어서 찍힘.
		System.out.println("결과 출력 하기");
		double totSum = list.stream()
				.mapToInt(a -> a.length())
				.peek(a -> System.out.println(a))//중간처리(글자 수를 갯수를 읽은것)
				.sum();//글자수를 합한것 중간처리
		System.out.println("글자수의 합:" + totSum);
	}
}
