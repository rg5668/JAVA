package ch14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 *  => Sort() : ��������� Ŭ������ �ݵ��
 *  Comparable �������̽��� ������ Ŭ������ ������
 */
public class ListComparable {
	public static void main(String[] args) {
		List<Person> li = new ArrayList<Person>();
		li.add(new Person("ȫ�浿", 10));
		li.add(new Person("ȫ�浿", 10));
		li.add(new Person("ȫ�浿", 30));
		li.add(new Person("������", 10));
		li.add(new Person("������", 16));
		li.add(new Person("ȫ�浿", 23));
		
		Person p1 = new Person("���", 20);
		li.add(p1);
		System.out.println(li);
		Collections.sort(li);	//�޼ҵ� ������ ��뵵 ����
//		sort(li);	//���� �˰����� �̷�����
		System.out.println(li);
	}
	
	static void sort(List<Person> li) {
		for (int i = 0; i < li.size()-1; i++) {
			for (int j = 0; j < li.size()-1-i; j++) {
				Person p1 = li.get(j);
				Person p2 = li.get(j+1);
				if (p1.compareTo(p2)>0) {
					li.set(j, p2);
					li.set(j+1, p1);
				}
			}
		}
	}
}
