package ch05;

import java.util.Scanner;

public class TimesTableWhile1 {
	public static void main(String[] args) {
		System.out.println("����� ���� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		
		int i = 1;
		while (i <= 9) {
			System.out.print(dan + "*" + i + "=" + (dan*i) + "\t");
			i++;
		}
		System.out.println();
	}
}
