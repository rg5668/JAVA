package ch15;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RandomToStreamEx1 {
	public static void main(String[] args) {
		System.out.println("int형 난수 스트림 :");
		IntStream isr = new Random().ints(3);
		isr.forEach(s->System.out.println(s));
		System.out.println("======================");
		
		//10개의 0부터 3전(0,1,2)까지 랜덤하게 출력
		isr = new Random().ints(10,0,3);
		isr.forEach(s->System.out.println(s));
		
		System.out.println("\nlong형 난수 스트림 :");
		//3개의 0부터 10전까지(0~9)까지 랜덤하게 출력
		LongStream lsr = new Random().longs(3,0,10);
		lsr.forEach(s->System.out.println(s));
		
		System.out.println("\ndouble형 난수 스티림 :");
		//3개의 0.0~1.0전까지 랜덤하게 출력
		DoubleStream dsr = new Random().doubles(3);
		dsr.forEach(s->System.out.println(s));
		
		//char를 int타입으로 변환도 가능함.
		IntStream csr = "Stream을 배우자".chars();
		csr.forEach(s->System.out.print((char)s+"["+(int)s+"]"));
	}
}
