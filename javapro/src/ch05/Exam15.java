package ch05;

import java.util.Scanner;

public class Exam15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����Ʈ�� �Է��ϼ���(1 ~ 1000) exit(9999)");
		int point = 0;
		
		while (true) {
			point = scan.nextInt();
			if (point==9999) {
				System.out.println("exit");
				break;
			}
			System.out.println(point+"��");
			switch(point/200) {
			case 0 : System.out.println("��ǰ�� �����ϴ�.");
			break;
			case 4 : System.out.println("�ڵ���,");
			case 3 : System.out.println("��ǻ��,");
			case 2 : System.out.println("�ڵ���,");
			case 1 : System.out.println("�����");
			}
		}
	}
	
}
