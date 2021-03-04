package ch05;

import java.util.Scanner;

public class DayByMonthTest {
	public static void main(String[] args) {
		System.out.println("달을 1 ~ 12까지로 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		int days = 0;
		switch (month) {
		case 2:
			days = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		default:
			days = 31;
		}
		System.out.printf("%d월은 %d일까지 있습니다.", month, days);
		scan.close();
	}
}
