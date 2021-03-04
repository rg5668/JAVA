package ch15;

import java.util.Arrays;
import java.util.List;

class Student {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
}
public class MapEx2 {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("ȫ�浿", 10),
				new Student("�ſ��", 20),
				new Student("���̼�", 30));
		
		studentList.stream()
//		.mapToInt(Studnet :: getScore)
		.mapToInt(s -> s.getScore())
		.forEach(socre -> System.out.print(socre));
		System.out.println();
		studentList.stream()
		.map(s -> s.getName())
		.forEach(name -> System.out.print(name));
	}
}
