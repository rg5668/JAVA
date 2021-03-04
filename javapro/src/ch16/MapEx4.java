package ch16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

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

public class MapEx4 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("�г� ���� �Է��ϼ���");
		int tgrade1 = scan.nextInt();
		
		BufferedReader br =
				new BufferedReader(new FileReader("src/ch14_Lamda/KICStudent.txt"));
		
		//��ü ���л���
		long count = br.lines()
				.map(s -> new KICStudent(s))
				.distinct()//�ߺ��˻�
				.count();//longŸ����
		
		System.out.println("��   " + count + "��");
		
		BufferedReader br2 =
				new BufferedReader(new FileReader("src/ch14_Lamda/KICStudent.txt"));
		
		//2�г� �л���
		long count2 = br2.lines()
				.map(s -> new KICStudent(s))
				.distinct().filter(s -> s.grade==tgrade1)
				.count();
//		int tgrade = 2;
		
		System.out.println(tgrade1 + "�г��� " + count2 + "��");
		
		BufferedReader br3 =
				new BufferedReader(new FileReader("src/ch14_Lamda/KICStudent.txt"));

		System.out.println("�г� \t�й� \t�̸� \t���� \t���� \t���� \t����");
		System.out.println("=========================================");
		//2�г� �л� �� ���ͷ� ��ģ ���
		br3.lines()
		.map(s->new KICStudent(s))
		.filter(s -> s.grade == tgrade1 )
		.filter(s -> s.kor < 50)
//		.sorted() //comparable
//		.sorted(new Comparator<KICStudent>() {
//			@Override
//			public int compare(KICStudent o1, KICStudent o2) {
//				return o1.kor - o2.kor;
//			}
//		})
//		.sorted((o1, o2)-> o1.kor - o2.kor)	//Comparator
		.sorted((o1,o2)->o1.name.compareTo(o2.name))//�̸��� ����
		.limit(10)
		.forEach(s -> System.out.println(s));
	}
}
