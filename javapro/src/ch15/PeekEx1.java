package ch15;

import java.util.Arrays;
import java.util.List;

public class PeekEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("aaa","bbb","ccc");
		System.out.println("��� ��� ����");
//		double totSum2  = 
		list.stream()
		.mapToInt(a -> a.length())
		.peek(a -> System.out.println(a));
		//����ó���� ��� ������.
//		.sum();
//		System.out.println(totSum2);
		
		//����ó���� �־ ����.
		System.out.println("��� ��� �ϱ�");
		double totSum = list.stream()
				.mapToInt(a -> a.length())
				.peek(a -> System.out.println(a))//�߰�ó��(���� ���� ������ ������)
				.sum();//���ڼ��� ���Ѱ� �߰�ó��
		System.out.println("���ڼ��� ��:" + totSum);
	}
}
