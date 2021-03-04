package ch14_Lamda_02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/*
 * Predicate
 * 매개값 조사해 true 또는 false를 리턴할 떄 사용
 */
public class PredicateExample {
	static class Student {
		private String name, sex;
		private int score;
		
		public Student(String name, String sex, int score) {
			this.name = name;
			this.sex = sex;
			this.score = score;
		}
		public String getSex() {
			return sex;
		}
		public int getScore() {
			return score;
		}
		public String getName() {
			return name;
		}
	}
	
	private static List<Student> list = Arrays.asList(//배열을 리스트처럼 사용할때 .asList
			new Student("홍길동", "남자", 90),
			new Student("김순희", "여자", 90),
			new Student("김자바", "남자", 95),
			new Student("박한나", "여자", 92));
	
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		for(Student student : list) {
			//predicate.test 매개값 조사해 true 또는 false를 리턴할 떄 사용
			if(predicate.test(student)) {//test라는 메소드가 안에 있음
				count++;
				sum += student.getScore();
			}
		}
		return (double) sum/count;
	}
	
	public static void main(String[] args) {
		double maleAvg = avg(t -> t.getSex().equals("남자"));
		System.out.println("남자 평균 점수: " + maleAvg);
		
		double femaleAvg = avg(t -> t.getSex().equals("여자"));
		System.out.println("여자 평균 점수: " + femaleAvg);
		
		double maleAvg1 = avg(t -> t.getName().contains("김"));//문자가 있는지 없는지 찾을떄는 
		System.out.println("박씨 평균 점수: " + maleAvg1);
	}
}
