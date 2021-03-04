package ch15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(new String[]{"ȫ�浿��","������","�����","����ġ��","�羾������"});
		System.out.println();
//		1���
//		Stream<String> strStream = list.stream();
//		Stream<Integer> st = strStream.mapToInt(String::length).boxed();
//		st.forEach(len -> System.out.println(len));

//		2��� ���ٷ� ��
		Stream<Integer> istr = list.stream().mapToInt(String::length).boxed();	
		istr.forEach(len -> System.out.println(len));

//		3���
		//�� ����� �� ���������� ���� ������ε� �Ҽ��ִ°�.
		System.out.println();
		list.stream().mapToInt(s -> s.length()).forEach(len -> System.out.println(len));
	}
}
