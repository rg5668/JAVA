package ch04;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		int coin;
		System.out.println("�ݾ��� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		coin = scan.nextInt();
		
		System.out.println("500�� :" + (coin/500));
		System.out.println("100�� :" + (coin%500/100));
		System.out.println("50�� :" + (coin%100/50));
		System.out.println("10�� :" + (coin%50/10));
		System.out.println("1�� :" + (coin%10));
	}
}
