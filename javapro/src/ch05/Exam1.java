package ch05;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = scan.nextInt();
		
		if (num>0) {
			System.out.println("���");
		} else if(num<0) {
			System.out.println("����");
		} else if(num == 0){
			System.out.println("0");
		}
	}
}
