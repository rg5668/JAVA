package ch05;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		do {
			System.out.println("제곱근을 알고 싶은 숫자를 입력하세요. (그만은 0)");
			i = scan.nextInt();
			System.out.println(i + "의 제곱근은 : " + Math.sqrt(i));
		}while(i>0);
	}
}
