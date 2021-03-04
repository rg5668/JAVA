package ch14_Lamda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class KICStudentEx1_1 {
	static Set<KICStudent> col = new HashSet();
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("src/ch14_Lamda/KICStudent.txt"));
		//파일을 읽어서 collection에 저장 합니다.
		while(sc.hasNext()) {
			col.add(new KICStudent(sc.next()));}//?
			System.out.println("총학생수: " + col.size());
			int grade = 1;
			printGrade(grade);
		}
		
		public static void printGrade(int grade) {
			List<KICStudent> gardeli = new ArrayList<KICStudent>();
			//1번은 1학년
			for (KICStudent stu : col) {
				if(stu.grade==grade)
					gardeli.add(stu);
			}
			Collections.sort(gardeli);
				System.out.println(grade+"학년     인원:"+gardeli.size());
				System.out.println("학년 \t학번 \t이름 \t국어 \t영어 \t수학 \t총점");
				System.out.println("=========================================");
				//5개만 찍기
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