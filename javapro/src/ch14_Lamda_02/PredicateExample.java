package ch14_Lamda_02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/*
 * Predicate
 * �Ű��� ������ true �Ǵ� false�� ������ �� ���
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
	
	private static List<Student> list = Arrays.asList(//�迭�� ����Ʈó�� ����Ҷ� .asList
			new Student("ȫ�浿", "����", 90),
			new Student("�����", "����", 90),
			new Student("���ڹ�", "����", 95),
			new Student("���ѳ�", "����", 92));
	
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		for(Student student : list) {
			//predicate.test �Ű��� ������ true �Ǵ� false�� ������ �� ���
			if(predicate.test(student)) {//test��� �޼ҵ尡 �ȿ� ����
				count++;
				sum += student.getScore();
			}
		}
		return (double) sum/count;
	}
	
	public static void main(String[] args) {
		double maleAvg = avg(t -> t.getSex().equals("����"));
		System.out.println("���� ��� ����: " + maleAvg);
		
		double femaleAvg = avg(t -> t.getSex().equals("����"));
		System.out.println("���� ��� ����: " + femaleAvg);
		
		double maleAvg1 = avg(t -> t.getName().contains("��"));//���ڰ� �ִ��� ������ ã������ 
		System.out.println("�ھ� ��� ����: " + maleAvg1);
	}
}
