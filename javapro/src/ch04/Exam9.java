package ch04;

import java.util.Scanner;

public class Exam9 {
	public static void main(String[] args) {
		System.out.println("반지름을 입력하세요");
		Scanner scan = new Scanner(System.in);
		double pi = 3.141592;
		
		int r = scan.nextInt();
		
		System.out.println("면적:"+(r*r*pi));
		System.out.println("둘레:"+(r*2*pi));
	}
}
