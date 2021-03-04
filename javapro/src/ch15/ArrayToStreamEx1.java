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
		
		stream1.forEach(s->System.out.print(s+"\t"));//a,b,c Iterator���� ����
		
		System.out.println();
		
		//1~2��� b,c��� (1���� 3������)�� ���
		Stream<String> stream2 = Arrays.stream(arr, 1, 3);
		stream2.forEach(s->System.out.print(s+"\t"));
		
		System.out.println();
		
		//���� �� �߰�(builder) + build�� �ؾ� ������
		Stream<String> stream3 = Stream.<String>builder()
				.add("�ڹ���")
				.add("��Ʈ����")
				.add("�����").build();
		stream3.forEach(s->System.out.print(s + " "));
		
		System.out.println();
		
		//�ݺ����� ���� 5�� ���. 
		//generate�� ������Ű��. limit ���� ����
		Stream<String> stream4 = Stream.generate(()->"��Ʈ��").limit(5);
		stream4.forEach(s->System.out.println(s));
		
		//����� ���� ���
		Stream<Double> stream6 = Stream.generate(Math :: random).limit(3);
		stream6.forEach(s->System.out.println(s));
		
		//30���� +2�ؼ� 10�� ���.
		Stream<Integer> stream5 = Stream.iterate(30, n -> n+2).limit(10);
		stream5.forEach(s->System.out.println(s));
	}
}
