package ch15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ȫ�浿","���","�̸���","�Ӳ���");
		System.out.println("�⺻ ����");
		//String�� �������� ����ִ� �⺻���� �𼾵�
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("�⺻�� ���� ����");
		list.stream()
		.sorted(Comparator.reverseOrder())
//		.forEach(System.out::println);
		.forEach(s -> System.out.println(s));
	}
}
