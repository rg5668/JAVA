package ch04;

import java.util.Scanner;

public class Exam6 {
	public static void main(String[] args) {
		System.out.println("사과의 갯수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
//		System.out.println("필요한 상자의 갯수"+(num/10+1));
		System.out.println("필요한 갯수:" + ((num%10>0)?(num/10)+1:num/10));
											//조건? 		참 : 거짓
	}
}
