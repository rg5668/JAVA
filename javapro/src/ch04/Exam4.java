package ch04;

import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println((num>0)?"양수":(num<0)?"음수":"0");
	}
}
