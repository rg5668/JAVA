package ch05;

import java.util.Random;
import java.util.Scanner;

public class GuGuQuizTest {
	public static void main(String[] args) {
		System.out.println("������ ������ ���߼���. �׸��Ϸ��� 0 �Է�");
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		while (true) {
			int num1 = ran.nextInt(9)+1;//0���� ��
			int num2 = ran.nextInt(9)+1;
			System.out.printf("%d * %d = %n", num1, num2);
			
			int result = scan.nextInt();
			if (result == 0) {
				break;
			} else {
				if (result == num1 * num2) {
					System.out.println("�����Դϴ�.");
				} else {
					System.out.println("������ " + (num1 * num2) + "�Դϴ�.");
				}
			}
		}
		scan.close();
	}
}
