package ch04;

import java.util.Scanner;

public class Exam7 {
	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		//�����
		String result = score >= 90 ? "A" : score >= 80 ? "B" :
			score >= 70 ? "C" : score >= 60 ? "D" :"F";
		System.out.println("�Է��� ������ " + score + "������ "+  result);
		
		//����� ���	//���� ? �� : ����
		System.out.println(score + "������ "+((score>=90) ? "A":
			(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F"));
	}
}
