package ch05;

import java.util.Scanner;

public class Exam12 {
	public static void main(String[] args) {
		System.out.println("�ﰢ���� ���̸� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= len; j++) {
				if (j<i) {
					System.out.print(" ");	
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}
}
