package ch05;

import java.util.Scanner;

public class Exam6 {
	public static void main(String[] args) {
		System.out.println("���ڿ��� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int i = 0;
		int sum = 0;
		while (i<str.length()) {
			sum+=(str.charAt(i)-'0'); // ����Ÿ���� '0'�� int�� 48
			i++;}
		
		//������ ������
		System.out.println("�ڸ��� �� :"+sum);
		
		i=0;
		sum=0;
		for (i = 0; i < str.length(); i++) {
			sum+=(str.charAt(i)-'0');
		}
		System.out.println("�ڸ��� �� :"+sum);
	}
}
