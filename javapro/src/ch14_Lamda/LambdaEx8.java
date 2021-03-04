package ch14_Lamda;

import java.util.function.Function;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

/*
 * Funtion �迭 �Լ� �������̽� : applyXXX �߻�޼��带 ����� ������.
 * �Ű������� �ְ�, ���ϰ��� ����.
 * �ַ� �Ű����� ���ϰ����� ����(Ÿ�� ��ȯ)�� ��� ���
 * Funtion<Parameter,Return> : �Ű����� : �Ķ����, ����Ÿ�� : Return
 */
class Student {
	private String name;
	private int eng;
	private int math;
	private String major;
	
	Student(){  }//������ �������
	
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
public class LambdaEx8 {
	private static Student[] list = {
		new Student("ȫ�浿", 90, 80, "�濵"),
		new Student("���", 95, 70, "�İ�")
	};
	public static void main(String[] args) {
//		for (Student s : list) {
//			System.out.println(s.getName());//apply:�����ϴ�.
//			//f(�����پ� �Ű�����).s(���� ����� ��ü)
//		}
		System.out.print("�л��� �̸�:");
		printString(t -> t.getName());
		
		System.out.print("���� �̸�:");
		printString(t -> t.getMajor());
		
		System.out.println("===========================");
		
		Function<Student, String> f2 = t->t.getName();
		
		printString(f2);
		
		printString(new Function<Student,String>() {
			@Override
			public String apply(Student t) {
				return t.getMajor();
			}
		});
		//---------------------------------------------
		System.out.print("���� ����:");
		printInt(t -> t.getEng());
		System.out.print("��������:");
		printInt(t -> t.getMath());
		//---------------------------------------------
		System.out.print("���� ���� �հ�:");
		printTot(t -> t.getEng());
		System.out.print("���� ���� �հ�:");
		printTot(t -> t.getMath());
		//---------------------------------------------
		System.out.print("���� ���� ���");
		printAvg(t -> t.getEng());
		System.out.print("���� ���� ���");
		printAvg(t -> t.getMath());
	}//main end
	
	private static void printTot(ToIntFunction<Student>f) {
		int sum = 0;
		for(Student s : list) {
			sum += f.applyAsInt(s);
		}
		System.out.println(sum);
	}
	
	private static void printAvg(ToIntFunction<Student>f) {
		int sum = 0;
		for(Student s : list) {
			sum += f.applyAsInt(s);
		}
		System.out.println(sum / list.length);
	}
	
	private static void printInt(ToIntFunction<Student>f) {
		for(Student s : list) {
			System.out.print(f.applyAsInt(s)+",");
		}
		System.out.println();
	}
	
	private static void printString(Function<Student, String> f) {
								//��üStudent�� String���� ����
		for (Student s : list) {
			System.out.print(f.apply(s)+",");//apply:�����ϴ�.
			//f(�����پ� �Ű�����).s(���� ����� ��ü)
		}
			System.out.println();
		}
	}