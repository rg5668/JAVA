package ch04;

import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {
		System.out.println("�Ѱ��� ���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char ch = str.charAt(0);
		String result = (ch>='a' && ch<='z')? (char)(ch-32)+"":"�ҹ��ھƴ�";
		System.out.println(result);
		System.out.println
			((ch>='a' && ch<='z')? (char)(ch-32)+"":"�ҹ��ھƴ�");
		System.out.println((char)97);//�ҹ���a
//		if (ch >= 'a' && ch <= 'z') { // �ҹ����� ��
//
//			System.out.println((char) (ch - ('a' - 'A')));
//
//		} else {
//
//			System.out.println("�ҹ��ھƴ�");
//
//		}

	}
}
