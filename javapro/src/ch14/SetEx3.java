package ch14;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
/*
 * TreeSet ����
 * Set > SortedSet ���� Ŭ����.
 * Set : �ߺ��Ұ�
 * SorredSet : ���ĵ�.
 * =>��������� Ŭ������ �ݵ�� Comparable �������̽��� ������ Ŭ������
 * 	TreeSet�� ��ҷ� ���� ����
 * ���� ���� �������̽�
 * 	-Comparator : �⺻ ���� ����� �߰��� �����ҋ� ���
 * 	-Comparable : �⺻ ���� ��� �����Ҷ� ���.
 */
public class SetEx3 {
	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<>();
//		set = new TreeSet<>(new Descending());	//8.0 ��������
//		set = new TreeSet<>(Comparator.reverseOrder());
		String from = "bat";
		String to = "d";
		set.add("abc"); set.add("alien"); set.add("bat"); set.add("azz");
		set.add("car"); set.add("Car"); set.add("disc"); set.add("dance");
		System.out.println(set);
		
		System.out.println("from:" + from + ",to:" + to);
		System.out.println(set.subSet(from, to));
		System.out.println("from:" + from + ",to:" + to+"zzzz");
		System.out.println(set.subSet(from, to+"zzzz"));
	}
}
class Descending implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2) * -1;
	}
}
