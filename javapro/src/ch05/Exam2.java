package ch05;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		System.out.println("�Ѱ��� ���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		//&&, || �ٽ� ����
		if (ch>='A' && ch<='Z') {
			System.out.println("�빮��");
		}else if (ch>='a' && ch<='z') {
			System.out.println("�ҹ���");
		}else if (ch>='0' && ch<='9') {
			System.out.println("����");
		}else {
			System.out.println("��Ÿ����");
		}
	}
}
