package ch16;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class OptionalEx2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i <= 100; i++) {
			list.add(i);
		}
		
		long count = list.stream().count();
		System.out.println("요소들의 갯수 : " + count);
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		//Integer객체에 있는 int값을(intValue을 사용) 뽑아내는것
		System.out.println("요소들의 합 : " + sum);
		
		OptionalDouble avg = list.stream().mapToInt(Integer::intValue).average();
		System.out.println("요소들의 평균 : " + avg.getAsDouble());
		
		OptionalInt max = list.stream().mapToInt(Integer::intValue).max();
		System.out.println("요소들 중 최대 값" + max.getAsInt());
		
		OptionalInt min = list.stream().mapToInt(Integer::intValue).min();
		System.out.println("요소들 중 최대 값" + min.getAsInt());
		
		OptionalInt first = list.stream().mapToInt(Integer::intValue).findFirst();
		System.out.println("요소들 중 최대 값" + first.getAsInt());
	}
}
