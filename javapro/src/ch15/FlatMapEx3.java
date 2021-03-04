package ch15;

import java.util.Arrays;
import java.util.stream.Stream;
//flatMap: stream을 연결 한개의 stream을 만든다
//차곡차곡 들어간다.
public class FlatMapEx3 {
	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
				new String[] {"abc","def","jkl"},
				new String[] {"ABC","DEF","JKL"} );
		
		Stream<String> stream =
				strArrStrm
				.flatMap(s -> Arrays.stream(s));
//				.flatMap(Arrays::stream);
		
		stream.forEach(s -> System.out.println(s));
	}
}
