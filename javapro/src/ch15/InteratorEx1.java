package ch15;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class InteratorEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				new String[] {"ȫ�浿","���","�̸���","������","�Ӳ���","�����"});
		System.out.println("�ܺ� �ݺ��� �̿�");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("���� �ݺ��� �̿�");
		list.stream().forEach(s->System.out.println(s));
		//Iterator ó�� �ϳ��� ��±���
	}
}
