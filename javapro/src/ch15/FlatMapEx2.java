package ch15;

import java.util.Arrays;
import java.util.List;
//flatMap: stream을 연결 한개의 stream을 만든다
public class FlatMapEx2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,50,60);
		
		list.stream()
		.flatMap(data -> {			//ex 10, 10+1, 10+2
		return Arrays.stream(new int[] {data, data+1, data+2}).boxed();
		}).forEach(n -> System.out.println(n));
	}
}
