package ch06;

import java.util.Scanner;

public class Exam_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score [] = new int[5];
		int sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		
		System.out.println("5���� ������ �Է��ϼ���");
		
		for (int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
			sum += score[i];
			if(max < score[i]) {
				max = score[i];
			}
			if (min > score[i]) {
				min = score[i];
			}
		}
		System.out.println("�հ� :" + sum);
		System.out.println("��� :" + (double)sum/score.length);
		System.out.println("�ִ밪 :" + max);
		System.out.println("�ּҰ� :" + min);
	}
}
