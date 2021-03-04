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
		System.out.println("��ҵ��� ���� :" + count);
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("��ҵ��� �� :" + sum);
		
		OptionalDouble avg = list.stream().mapToInt(Integer::intValue).average();
		if (avg.isPresent()) {//isPresent�� avg�ȿ� ���� ���ų� ���̸� false�� ��� X
			System.out.println("��ҵ��� ��� :" + avg.getAsDouble());
		}
		
		int max = list.stream().mapToInt(Integer::intValue).max().orElse(0);
		System.out.println("��ҵ� �� �ִ� �� :" + max);
		
		list.stream().mapToInt(Integer::intValue).findFirst() //findAny�� ��Ҹ� ã�Ƴ��� ���� ������ ����ƮX
					.ifPresent(a -> System.out.println("��ҵ� �� ù��° ��" + a));//ifPresent ��ü�� ���ΰ� �ִ� ���� ������ ��쿡�� ����
	}
}
