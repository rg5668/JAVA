package ch05;

import java.util.Scanner;

public class SwitchString {
	public static void main(String[] args) {
		System.out.println("�ڱ� ���� �Ẹ��(���� ����) ������ �Ⱦ��� ����");
		Scanner scan = new Scanner(System.in);
		String level = scan.next();
		String levelString = "";
//		String level = "������";
		switch (level) {
		case "������":
			levelString = "��ڰ���, ȸ������, �۾���, ����";
			break;
		case "���":
			levelString = "ȸ������, �۾���, ����";
			break;
		case "ȸ��":
			levelString = "�۾���, ����";
			break;
		default:
			levelString = "����";
		}
		System.out.println("����� ������: " + levelString);
	}
}
