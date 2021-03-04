package ch05;

import java.util.Scanner;

public class SwitchString {
	public static void main(String[] args) {
		System.out.println("자기 직급 써보기(권한 나옴) 없으면 안쓰고 엔터");
		Scanner scan = new Scanner(System.in);
		String level = scan.next();
		String levelString = "";
//		String level = "관리자";
		switch (level) {
		case "관리자":
			levelString = "운영자관리, 회원관리, 글쓰기, 보기";
			break;
		case "운영자":
			levelString = "회원관리, 글쓰기, 보기";
			break;
		case "회원":
			levelString = "글쓰기, 보기";
			break;
		default:
			levelString = "보기";
		}
		System.out.println("당신의 권한은: " + levelString);
	}
}
