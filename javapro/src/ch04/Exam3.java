package ch04;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		int coin;
		System.out.println("금액을 입력하세요");
		Scanner scan = new Scanner(System.in);
		coin = scan.nextInt();
		
		System.out.println("500원 :" + (coin/500));
		System.out.println("100원 :" + (coin%500/100));
		System.out.println("50원 :" + (coin%100/50));
		System.out.println("10원 :" + (coin%50/10));
		System.out.println("1원 :" + (coin%10));
	}
}
