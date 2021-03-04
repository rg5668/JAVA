package ch15;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStreamEx1 {
	public static void main(String[] args) {
		String[] arr = new String[] {"a","b","c"};
		Stream<String> stream1 = Arrays.stream(arr);
		
//		Stream<String> stream2 = 
//				Stream.of(new String[] {"a","b","c"});
//		
//		Stream<String> stream3 = 
//				Stream.of(arr);
		
		stream1.forEach(s->System.out.print(s+"\t"));//a,b,c Iterator같은 느낌
		
		System.out.println();
		
		//1~2요소 b,c출력 (1부터 3전까지)만 출력
		Stream<String> stream2 = Arrays.stream(arr, 1, 3);
		stream2.forEach(s->System.out.print(s+"\t"));
		
		System.out.println();
		
		//생성 및 추가(builder) + build를 해야 보여줌
		Stream<String> stream3 = Stream.<String>builder()
				.add("자바의")
				.add("스트림을")
				.add("배우자").build();
		stream3.forEach(s->System.out.print(s + " "));
		
		System.out.println();
		
		//반복으로 문자 5번 찍기. 
		//generate는 생성시키다. limit 한정 숫자
		Stream<String> stream4 = Stream.generate(()->"스트림").limit(5);
		stream4.forEach(s->System.out.println(s));
		
		//더블로 랜덤 찍기
		Stream<Double> stream6 = Stream.generate(Math :: random).limit(3);
		stream6.forEach(s->System.out.println(s));
		
		//30부터 +2해서 10번 찍기.
		Stream<Integer> stream5 = Stream.iterate(30, n -> n+2).limit(10);
		stream5.forEach(s->System.out.println(s));
	}
}
