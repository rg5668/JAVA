package ch05;

import java.util.Scanner;

public class TimesTableFor1 {
	public static void main(String[] args) {
		System.out.println("출력할 단을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i) + "\n");
		}
	}
}
