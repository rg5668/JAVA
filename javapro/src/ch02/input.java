package ch02;

import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.");
		String line = scanner.nextLine();
		System.out.printf("입력한 문자열: %s%n", line);
	}

}
