package ch04;

import java.util.Scanner;

public class Exam8 {
	public static void main(String[] args) {
		System.out.println("10부터 99까지의 두자리수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int result = (num%10==0)?num:(((num/10)+1)*10);
		System.out.println(result+"-"+num+"="+(result-num));
//		System.out.println((num%10==0));
	}
}
