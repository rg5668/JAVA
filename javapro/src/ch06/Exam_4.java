package ch06;

import java.util.Scanner;

public class Exam_4 {
	public static void main(String[] args) {
		char[] data = {'0','1','2','3','4','5','6','7','8','9',
				'A','B','C','D','E','F'};
		System.out.println("16������ ��ȯ�� 10������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		char hex [] = new char[32];
		
		int divnum = num, index = 0;
		
		while (divnum != 0) {
			hex[index++] = data[divnum % 16];
			divnum /= 16;
		}
		System.out.println(index);
		System.out.println(num + "�� 16���� :");
		
		for (int i = index -1; i >= 0; i--) {
			System.out.print(hex[i] + " ");
		}
	}
}