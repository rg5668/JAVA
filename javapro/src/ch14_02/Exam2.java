package ch14_02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Student {
	String studno, name, major;
	
	public Student(String studno, String name, String major) {
		this.studno = studno;
		this.name = name;
		this.major = major;
	}
	@Override
	public int hashCode() {
		return studno.hashCode()+name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			//��ü���� ������ �� equals
			return studno.equals(s.studno)&&name.equals(s.name);
		} else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "(" + studno + "," + name + "," + major +")";
	}
}
public class Exam2 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		set.add(new Student("1234","ȫ�浿","�濵"));
		set.add(new Student("2345","ȫ���","�濵"));
		set.add(new Student("2345","ȫ���","�İ�"));//�ߺ�X
		set.add(new Student("1234","ȫ�浿","���"));//�ߺ�X
		set.add(new Student("4567","ȫ�浿","�濵"));
		System.out.println("��� �л� ��:" + set.size());
		System.out.println(set);
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next().hashCode());
		}
		
		if (set.size() <= 4) {
			set.add(new Student("1223","�Ӱ���","����"));
		}
		System.out.println(set);
	}
}
