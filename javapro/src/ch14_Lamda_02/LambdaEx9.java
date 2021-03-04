package ch14_Lamda_02;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

/*
 * Operator �������̽� ���� : apply �迭 �߻� �޼��� ����
 * 	�Ű����� �ְ�, ���ϰ��� ����. =>
 * 		�� �Ű������� �ڷ����� ���ϰ��� �ڷ����� ����.
 * Function �������̽��� ���� �������̽���.
 * result = op.applyAsInt(result, next);
 */
public class LambdaEx9 {
	private static Student[] list = {
			new Student("ȫ�浿", 90, 80, "�濵"),
			new Student("���", 95, 70, "�İ�"),
			new Student("�̸���", 100, 70, "����")
	};
	public static void main(String[] args) {
		List li = Arrays.asList(list);
		System.out.print("�ִ� ���а�:");
		int max = maxOrMinMath((a,b)->{
			if(a>=b) return a;
				else return b;});
		System.out.println(max);
		System.out.print("�ּ� ���а�:");
		System.out.println(maxOrMinMath((a,b)->(a<=b)?a:b));
		System.out.print("�ִ� ��հ�:");
		System.out.println(maxOrMinAvg((a,b)->(a>=b)?a:b));
		System.out.print("�ּ� ��հ�:");
		System.out.println(maxOrMinAvg((a,b)->(a<=b)?a:b));
	}
	/*
	 * IntBinaryOperator op = (a,b) -> (a>=b?a:b);
	 * int applyAsInt(a,b) {return (a>=b)?a:b;}
	 */
	private static int maxOrMinMath(IntBinaryOperator op) {
		int result = list[0].getMath();
		for(Student s : list) {
			result = op.applyAsInt(result, s.getMath());
		}
		return result;
	}
	
	private static double maxOrMinAvg(DoubleBinaryOperator op) {
		double result = (list[0].getMath() + list[0].getEng())/2;
		for(Student s : list) {
			result = op.applyAsDouble(result, (s.getMath()+s.getEng())/2);
		}
		return result;
	}
}

class Student {
	private String name;
	private int eng;
	private int math;
	private String major;
	
//	Student(){  }//������ �������
	
	public Student(String name, int eng, int math, String major) {
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
	}
	//getter
	public String getName() {
		return name;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public String getMajor() {
		return major;
	}
}
