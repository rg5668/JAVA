package ch14_Lamda;

import java.util.function.Function;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

/*
 * Funtion 계열 함수 인터페이스 : applyXXX 추상메서드를 멤버로 가진다.
 * 매개변수도 있고, 리턴값도 존재.
 * 주로 매개값을 리턴값으로 매핑(타입 변환)할 경우 사용
 * Funtion<Parameter,Return> : 매개변수 : 파라메터, 리턴타입 : Return
 */
class Student {
	private String name;
	private int eng;
	private int math;
	private String major;
	
	Student(){  }//생성자 비어있음
	
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
		new Student("홍길동", 90, 80, "경영"),
		new Student("김삿갓", 95, 70, "컴공")
	};
	public static void main(String[] args) {
//		for (Student s : list) {
//			System.out.println(s.getName());//apply:응용하다.
//			//f(가져다쓸 매개변수).s(현재 사용할 객체)
//		}
		System.out.print("학생의 이름:");
		printString(t -> t.getName());
		
		System.out.print("전공 이름:");
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
		System.out.print("영어 점수:");
		printInt(t -> t.getEng());
		System.out.print("수학점수:");
		printInt(t -> t.getMath());
		//---------------------------------------------
		System.out.print("영어 점수 합계:");
		printTot(t -> t.getEng());
		System.out.print("수학 점수 합계:");
		printTot(t -> t.getMath());
		//---------------------------------------------
		System.out.print("영어 점수 평균");
		printAvg(t -> t.getEng());
		System.out.print("수학 점수 평균");
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
								//객체Student를 String으로 매핑
		for (Student s : list) {
			System.out.print(f.apply(s)+",");//apply:응용하다.
			//f(가져다쓸 매개변수).s(현재 사용할 객체)
		}
			System.out.println();
		}
	}