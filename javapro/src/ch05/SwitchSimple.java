package ch05;

import java.util.Scanner;

public class SwitchSimple {
	public static void main(String[] args) {
		System.out.println("당신의 권한 번호를 입력해주세요");
		Scanner scan = new Scanner(System.in);
		int level = scan.nextInt();
//		int level = 0;
		String levelString="";
		switch (level) {
		case 0:
			levelString="운영자관리, 회원관리, 글쓰기, 보기";
			break;
		case 1:
			levelString="회원관리, 글쓰기, 보기";
			break;
		case 2:
			levelString="글쓰기, 보기";
			break;
		default:
			levelString="보기";
		}
		System.out.println("당신의 권한은: " + levelString);
	}
}
