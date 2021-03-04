package ch16;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class OptionalEx1 {
	public static void main(String[] args) {
		int[] arr = new int[100];
		
		for (int i = 1; i <= 100; i++) {
			arr[i-1] = i;//i는 1이니깐 0에서 1을 넣어서 해야된다.
		//	arr[1-1]은 0이고 = i는 1이다.;
		}
		
		long count = Arrays.stream(arr).count();
		System.out.println("요소들의 갯수 : " + count);
		
		int sum = Arrays.stream(arr).sum();
		System.out.println("요소들의 합 : " + sum);
		
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println("요소들의 평균 : " + avg.getAsDouble());
		
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println("요소들 중 최대 값 : " + max.getAsInt());
		
		OptionalInt min = Arrays.stream(arr).min();
		System.out.println("요소들 중 최소 값 :" + min.getAsInt());
		
		OptionalInt first = Arrays.stream(arr).findAny();//findAny는 최종연산
		System.out.println("요소들 중 첫번째 값 : " + first.getAsInt());
	}
}
