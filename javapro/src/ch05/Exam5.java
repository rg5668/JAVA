package ch05;

import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {
		System.out.println("�ڿ����� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		int value = num;
		
		for (value=num; value!=0; value /= 10) {
			sum += value%10;
		}
		sum+=value;
		System.out.println("�ڸ��� �� :" + sum);
	}
}
