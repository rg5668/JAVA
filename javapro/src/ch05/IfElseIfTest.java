package ch05;

import java.util.Scanner;

public class IfElseIfTest {
	public static void main(String[] args) {
		System.out.println("32 ~ 126 ������ ������ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int scanned = scan.nextInt();
		String type = null;
		if (scanned >= 48 && scanned <58) {
			type = "����";
		} else if (scanned >= 65 && scanned <91) {
			type = "�빮��";
		} else if (scanned >= 97 && scanned <123) {
			type = "�ҹ���";
		} else {
			type = "��Ÿ Ÿ��";
		}
		System.out.printf("���� %d�� ���ڷ� %c�̰� %s�Դϴ�.", scanned, scanned, type);
		
		scan.close();
	}
}
