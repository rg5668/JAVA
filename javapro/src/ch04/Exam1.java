package ch04;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		int num = 0;
//		int si, bun, co;
		
		System.out.println("����� �ʸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();

//		si = num / 3600;
//		bun = num % 3600/ 60;
//		co = num % 60;
//		System.out.println(si + "��" + bun + "��"+ co + "��");
		System.out.print(num/3600+"�� ");
		System.out.print((num%3600)/60+"�� ");
		System.out.println(num%60+"�� ");

	}

}
