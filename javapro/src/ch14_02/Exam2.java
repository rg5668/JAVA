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
			//객체끼리 내용을 비교 equals
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
		set.add(new Student("1234","홍길동","경영"));
		set.add(new Student("2345","홍길순","경영"));
		set.add(new Student("2345","홍길순","컴공"));//중복X
		set.add(new Student("1234","홍길동","통계"));//중복X
		set.add(new Student("4567","홍길동","경영"));
		System.out.println("등록 학생 수:" + set.size());
		System.out.println(set);
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next().hashCode());
		}
		
		if (set.size() <= 4) {
			set.add(new Student("1223","임건희","개발"));
		}
		System.out.println(set);
	}
}
