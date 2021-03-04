package ch16;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalEx4 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
//		for (int i = 1; i <= 10; i++) {
//			list.add(i);
//		}
		long count = list.stream().count();
		System.out.println("요소들의 갯수 :" + count);
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("요소들의 합 :" + sum);
		
		OptionalDouble avg = list.stream().mapToInt(Integer::intValue).average();
		if (avg.isPresent()) {//isPresent는 avg안에 값이 없거나 널이면 false로 출력 X
			System.out.println("요소들의 평균 :" + avg.getAsDouble());
		}
		
		int max = list.stream().mapToInt(Integer::intValue).max().orElse(0);
		System.out.println("요소들 중 최대 값 :" + max);
		
		list.stream().mapToInt(Integer::intValue).findFirst() //findAny는 요소를 찾아내서 리턴 없으면 프린트X
					.ifPresent(a -> System.out.println("요소들 중 첫번째 값" + a));//ifPresent 객체가 감싸고 있는 값이 존재할 경우에만 실행
	}
}
