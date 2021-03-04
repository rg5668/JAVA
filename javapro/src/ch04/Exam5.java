package ch04;

import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {
		System.out.println("한개의 문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char ch = str.charAt(0);
		String result = (ch>='a' && ch<='z')? (char)(ch-32)+"":"소문자아님";
		System.out.println(result);
		System.out.println
			((ch>='a' && ch<='z')? (char)(ch-32)+"":"소문자아님");
		System.out.println((char)97);//소문자a
//		if (ch >= 'a' && ch <= 'z') { // 소문자일 때
//
//			System.out.println((char) (ch - ('a' - 'A')));
//
//		} else {
//
//			System.out.println("소문자아님");
//
//		}

	}
}
