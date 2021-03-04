package ch15;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RandomToStreamEx1 {
	public static void main(String[] args) {
		System.out.println("int�� ���� ��Ʈ�� :");
		IntStream isr = new Random().ints(3);
		isr.forEach(s->System.out.println(s));
		System.out.println("======================");
		
		//10���� 0���� 3��(0,1,2)���� �����ϰ� ���
		isr = new Random().ints(10,0,3);
		isr.forEach(s->System.out.println(s));
		
		System.out.println("\nlong�� ���� ��Ʈ�� :");
		//3���� 0���� 10������(0~9)���� �����ϰ� ���
		LongStream lsr = new Random().longs(3,0,10);
		lsr.forEach(s->System.out.println(s));
		
		System.out.println("\ndouble�� ���� ��Ƽ�� :");
		//3���� 0.0~1.0������ �����ϰ� ���
		DoubleStream dsr = new Random().doubles(3);
		dsr.forEach(s->System.out.println(s));
		
		//char�� intŸ������ ��ȯ�� ������.
		IntStream csr = "Stream�� �����".chars();
		csr.forEach(s->System.out.print((char)s+"["+(int)s+"]"));
	}
}
