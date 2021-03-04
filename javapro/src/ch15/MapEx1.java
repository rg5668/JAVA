package ch15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(new String[]{"홍길동전","춘향전","구운몽","전우치전","사씨남정기"});
		System.out.println();
//		1방법
//		Stream<String> strStream = list.stream();
//		Stream<Integer> st = strStream.mapToInt(String::length).boxed();
//		st.forEach(len -> System.out.println(len));

//		2방법 한줄로 끝
		Stream<Integer> istr = list.stream().mapToInt(String::length).boxed();	
		istr.forEach(len -> System.out.println(len));

//		3방법
		//이 방법이 더 간편하지만 위에 방법으로도 할수있는것.
		System.out.println();
		list.stream().mapToInt(s -> s.length()).forEach(len -> System.out.println(len));
	}
}
