package ch05;

import java.util.Scanner;

public class SwitchSimple {
	public static void main(String[] args) {
		System.out.println("����� ���� ��ȣ�� �Է����ּ���");
		Scanner scan = new Scanner(System.in);
		int level = scan.nextInt();
//		int level = 0;
		String levelString="";
		switch (level) {
		case 0:
			levelString="��ڰ���, ȸ������, �۾���, ����";
			break;
		case 1:
			levelString="ȸ������, �۾���, ����";
			break;
		case 2:
			levelString="�۾���, ����";
			break;
		default:
			levelString="����";
		}
		System.out.println("����� ������: " + levelString);
	}
}
