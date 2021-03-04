package ch05;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		
		if (num>0) {
			System.out.println("양수");
		} else if(num<0) {
			System.out.println("음수");
		} else if(num == 0){
			System.out.println("0");
		}
	}
}
