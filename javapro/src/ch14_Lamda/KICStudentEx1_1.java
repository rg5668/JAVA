package ch14_Lamda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class KICStudentEx1_1 {
	static Set<KICStudent> col = new HashSet();
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("src/ch14_Lamda/KICStudent.txt"));
		//������ �о collection�� ���� �մϴ�.
		while(sc.hasNext()) {
			col.add(new KICStudent(sc.next()));}//?
			System.out.println("���л���: " + col.size());
			int grade = 1;
			printGrade(grade);
		}
		
		public static void printGrade(int grade) {
			List<KICStudent> gardeli = new ArrayList<KICStudent>();
			//1���� 1�г�
			for (KICStudent stu : col) {
				if(stu.grade==grade)
					gardeli.add(stu);
			}
			Collections.sort(gardeli);
				System.out.println(grade+"�г�     �ο�:"+gardeli.size());
				System.out.println("�г� \t�й� \t�̸� \t���� \t���� \t���� \t����");
				System.out.println("=========================================");
				//5���� ���
				for (int i = 0; i < 5; i++) {
					System.out.println(gardeli.get(i));
				}
		}
}
	

class KICStudent implements Comparable<KICStudent>{
	public int grade;
	public int sno;
	public String name;
	public int kor;
	public int eng;
	public int math;
	public int total;
	
	public KICStudent (String line) {//sc.next�� ����.
		String [] str = line.split(",");
		this.grade = Integer.parseInt(str[0]);
		this.sno = Integer.parseInt(str[1]);
		this.name = str[2];
		this.kor = Integer.parseInt(str[3]);
		this.eng = Integer.parseInt(str[4]);
		this.math = Integer.parseInt(str[5]);
		this.total = kor+eng+math;
	}
	@Override
	public String toString() {
		return grade + "\t" + sno + "\t" + name + "\t" + kor + "\t" +
				eng + "\t" + math + "\t" + total;
	}
	
	@Override
	public boolean equals(Object obj) {//�̸� �ߺ� �˻�
		if(obj instanceof KICStudent) {
			KICStudent kic = (KICStudent)obj;
			return name.equals(kic.name)&&(sno == kic.sno);
		} else {
		return false;
		}
	}
	//�̸��� �й�
	@Override
	public int hashCode() {
		return name.hashCode()+sno;
	}
	
	@Override
	public int compareTo(KICStudent o) {
		return o.total - total;//��� �𼾵�
	}
}