package ch05;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		do {
			System.out.println("�������� �˰� ���� ���ڸ� �Է��ϼ���. (�׸��� 0)");
			i = scan.nextInt();
			System.out.println(i + "�� �������� : " + Math.sqrt(i));
		}while(i>0);
	}
}
