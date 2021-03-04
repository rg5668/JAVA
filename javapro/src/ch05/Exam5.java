package ch05;

import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {
		System.out.println("자연수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		int value = num;
		
		for (value=num; value!=0; value /= 10) {
			sum += value%10;
		}
		sum+=value;
		System.out.println("자리수 합 :" + sum);
	}
}
