package ch04;

import java.util.Scanner;

public class Exam9 {
	public static void main(String[] args) {
		System.out.println("�������� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		double pi = 3.141592;
		
		int r = scan.nextInt();
		
		System.out.println("����:"+(r*r*pi));
		System.out.println("�ѷ�:"+(r*2*pi));
	}
}
