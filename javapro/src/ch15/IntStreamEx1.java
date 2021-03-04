package ch15;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamEx1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println("Arrays.stream 메서드를 이용하여 IntSreeam 생성하기");
		IntStream intstream1 = Arrays.stream(arr);
		intstream1.forEach(s->System.out.print(s+"\t"));
		
		System.out.println("\nIntStream.of 메서드를 이용하여 IntSreeam 생성하기");
		IntStream intstream2 = IntStream.of(arr);
		intstream2.forEach(s->System.out.print(s+"\t"));
		
		//범위(range) 설정 0부터 9전까지 (0~8) 생성하기
		System.out.println("\nIntStream.range(0,9) 메서드를 이용하여 IntSreeam 생성하기");
		IntStream intstream3 = IntStream.range(0, 9);
		intstream3.forEach(s->System.out.print(s+"\t"));
		
		//범위 종료까지(rangeClosed) 1부터 5까지 (1,2,3,4,5) 생성하기
		System.out.println("\nIntStream.rangeClosed(1,5) 메서드를 이용하여 IntSreeam 생성하기");
		IntStream intstream4 = IntStream.rangeClosed(1, 5); 
		intstream4.forEach(s->System.out.print(s+"\t"));
	}
}
