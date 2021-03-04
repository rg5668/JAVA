package ch16;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class OptionalEx1 {
	public static void main(String[] args) {
		int[] arr = new int[100];
		
		for (int i = 1; i <= 100; i++) {
			arr[i-1] = i;//i�� 1�̴ϱ� 0���� 1�� �־ �ؾߵȴ�.
		//	arr[1-1]�� 0�̰� = i�� 1�̴�.;
		}
		
		long count = Arrays.stream(arr).count();
		System.out.println("��ҵ��� ���� : " + count);
		
		int sum = Arrays.stream(arr).sum();
		System.out.println("��ҵ��� �� : " + sum);
		
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println("��ҵ��� ��� : " + avg.getAsDouble());
		
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println("��ҵ� �� �ִ� �� : " + max.getAsInt());
		
		OptionalInt min = Arrays.stream(arr).min();
		System.out.println("��ҵ� �� �ּ� �� :" + min.getAsInt());
		
		OptionalInt first = Arrays.stream(arr).findAny();//findAny�� ��������
		System.out.println("��ҵ� �� ù��° �� : " + first.getAsInt());
	}
}
