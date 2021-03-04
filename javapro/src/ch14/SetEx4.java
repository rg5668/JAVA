package ch14;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
/*
 * ���� ���� �������̽�
 * Comparable �������̽� : �߻�޼��� compareTo(Object)
 * 						Ŭ������ �⺻ ���� ��� ����
 * Comparator �������̽� : �߻�޼��� compare(Object o1, Object o2)
 * 						�⺻���� ��� ��� �������� �ʰ� ����ڰ� ���Ƿ� ���� ����� ����
 */
class Phone implements Comparable<Phone>{
	String name;
	int number;
	public Phone(String name, int number) {
		this.name = name;
		this.number = number;
	}
	@Override
	public String toString() {
		return "(" + name + "," + number + ")";
	}
	@Override
	public int compareTo(Phone p) {
		return name.compareTo(p.name);
	}
}
public class SetEx4 {
	public static void main(String[] args) {
		System.out.println("�̸������� ���");
		TreeSet<Phone> set = new TreeSet<>();//Ʈ������ �ڵ� ������ ����
		set.add(new Phone("ȫ�浿",1234));
		set.add(new Phone("���",3456));
		set.add(new Phone("�̸���",5678));
		
		System.out.println(set);
		
		System.out.println("��ȭ��ȣ������ ���");
//		set = new TreeSet<>(new Comparator<Phone>() {//�͸� Ŭ������ ���� ���
//			@Override
//			public int compare(Phone p1, Phone p2) {
//				return p1.number - p2.number;
//			}
//		});
//		set = new TreeSet<>(new NumberAsc());	//Ŭ���� �����ϰ� ȣ���ص���
		set.add(new Phone("ȫ�浿",1234));
		set.add(new Phone("���",3456));
		set.add(new Phone("�̸���",5678));
		System.out.println(set);
		
		System.out.println("�̸��� �������� ���");
		set = new TreeSet<>(Comparator.reverseOrder());//Comparator�ȿ� ���� �Ǿ��ִ°�
		set.add(new Phone("ȫ�浿",1234));
		set.add(new Phone("ȲŰŰ",3456));
		set.add(new Phone("�̸���",5678));
		System.out.println(set);
		
		System.out.println("��ȭ��ȣ�� �������� ���");
		set = new TreeSet<>(new Comparator<Phone>() {
			@Override
			public int compare(Phone p1, Phone p2) {
				return p2.number - p1.number;
			}
		});
		set.add(new Phone("ȫ�浿",1234));
		set.add(new Phone("���",3456));
		set.add(new Phone("�̸���",5678));
		System.out.println(set);
	}
}

