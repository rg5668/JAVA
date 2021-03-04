package ch05;

import java.util.Random;
import java.util.Scanner;

public class GuGuQuizTest {
	public static void main(String[] args) {
		System.out.println("구구단 문제를 맞추세요. 그만하려면 0 입력");
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		while (true) {
			int num1 = ran.nextInt(9)+1;//0부터 됨
			int num2 = ran.nextInt(9)+1;
			System.out.printf("%d * %d = %n", num1, num2);
			
			int result = scan.nextInt();
			if (result == 0) {
				break;
			} else {
				if (result == num1 * num2) {
					System.out.println("정답입니다.");
				} else {
					System.out.println("정답은 " + (num1 * num2) + "입니다.");
				}
			}
		}
		scan.close();
	}
}
