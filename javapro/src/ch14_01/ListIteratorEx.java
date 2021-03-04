package ch14_01;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/*
 * Iterator �� �ѹ������θ� ����
 * ListIterator �� ��������� ����(���� ��°���)
 */
public class ListIteratorEx {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		for (int i = 1; i <= 5; i++) {
			list.add(i*100);
		}
		
		ListIterator lit = list.listIterator();
			
		while (lit.hasNext()) {//hasNext ���� ���� ������ true
			System.out.println(lit.next());//next�� ������
		}
			
		System.out.println("========================");
		
		//������ ��ȸ�ҋ� hasPrevious
		while(lit.hasPrevious()) {//hasPrevious ���� ���� ������ true
			System.out.println(lit.previous());//previous�� ���
		}
	}
}
