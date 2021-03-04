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
	
	public KICStudent (String line) {//sc.next가 들어옴.
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
	public boolean equals(Object obj) {//이름 중복 검사
		if(obj instanceof KICStudent) {
			KICStudent kic = (KICStudent)obj;
			return name.equals(kic.name)&&(sno == kic.sno);
		} else {
		return false;
		}
	}
	//이름과 학번
	@Override
	public int hashCode() {
		return name.hashCode()+sno;
	}
	
	@Override
	public int compareTo(KICStudent o) {
		return o.total - total;//어센딩 디센딩
	}
}

public class MapEx4 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("학년 수를 입력하세요");
		int tgrade1 = scan.nextInt();
		
		BufferedReader br =
				new BufferedReader(new FileReader("src/ch14_Lamda/KICStudent.txt"));
		
		//전체 총학생수
		long count = br.lines()
				.map(s -> new KICStudent(s))
				.distinct()//중복검사
				.count();//long타입임
		
		System.out.println("총   " + count + "명");
		
		BufferedReader br2 =
				new BufferedReader(new FileReader("src/ch14_Lamda/KICStudent.txt"));
		
		//2학년 학생수
		long count2 = br2.lines()
				.map(s -> new KICStudent(s))
				.distinct().filter(s -> s.grade==tgrade1)
				.count();
//		int tgrade = 2;
		
		System.out.println(tgrade1 + "학년은 " + count2 + "명");
		
		BufferedReader br3 =
				new BufferedReader(new FileReader("src/ch14_Lamda/KICStudent.txt"));

		System.out.println("학년 \t학번 \t이름 \t국어 \t영어 \t수학 \t총점");
		System.out.println("=========================================");
		//2학년 학생 중 필터로 거친 결과
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
		.sorted((o1,o2)->o1.name.compareTo(o2.name))//이름별 정렬
		.limit(10)
		.forEach(s -> System.out.println(s));
	}
}
