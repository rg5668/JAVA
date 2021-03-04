package ch04;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		int num = 0;
//		int si, bun, co;
		
		System.out.println("계산할 초를 입력하세요");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();

//		si = num / 3600;
//		bun = num % 3600/ 60;
//		co = num % 60;
//		System.out.println(si + "시" + bun + "분"+ co + "초");
		System.out.print(num/3600+"시 ");
		System.out.print((num%3600)/60+"분 ");
		System.out.println(num%60+"초 ");

	}

}
