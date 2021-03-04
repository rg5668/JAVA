package ch14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {
		//<Integer> : ���׸�ǥ��
		//List<Integer> : Integer ��ü�� ����Ʈ�� ������.
		//ArrayList : �����迭. ������ ������ ���� ��ü�� ����.
		//				÷�� ��밡��
		List<Integer> list = new ArrayList<Integer>();
		list.add(1); list.add(2); list.add(5); list.add(4);
		list.add(3); list.add(0); list.add(0); list.add(4);
		System.out.println(list);	//������� ���� �ߺ� ����
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		//list.subList(1,4)// : list��ü�� 1���ε������� 3���ε������� �κи���Ʈ�� ����
		
		//list 1���� 4������ (1~3)
		List<Integer> list2 = new ArrayList<Integer>(list.subList(1, 4));
		System.out.println(list2);
		//list2�� ����	list 1���� 4������ (1~3)
		//Collections : Collection �����ӿ�ũ�� ���õ� �߰� ����� ����� ���� Ŭ����
		//List�� Comparable�� ��ӹ޾Ƽ� �ڵ����� ����
		Collections.sort(list2);	//����
		System.out.println(list2);
	}
}
