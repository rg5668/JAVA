package ch05;

import java.util.Scanner;

public class Exam6 {
	public static void main(String[] args) {
		System.out.println("문자열을 입력하세요");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int i = 0;
		int sum = 0;
		while (i<str.length()) {
			sum+=(str.charAt(i)-'0'); // 문자타입의 '0'이 int로 48
			i++;}
		
		//조건을 렝스로
		System.out.println("자리수 합 :"+sum);
		
		i=0;
		sum=0;
		for (i = 0; i < str.length(); i++) {
			sum+=(str.charAt(i)-'0');
		}
		System.out.println("자리수 합 :"+sum);
	}
}
