package ch05;

import java.util.Scanner;


public class NestedIf {
	public static void main(String[] args) {
		String result ="";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���̸� �Է��ϼ���.");
		int age = scan.nextInt();
		
		System.out.println("��ȣ�ڰ� �����ϳ���?");
//		boolean withParent = scan.nextBoolean();
//		String withParent = scan.next();
		char withParent = scan.next().charAt(0);
		
		if (age >= 12) {
			result = "������";
		} else {
			if (withParent=='Y'+'y') {
				result = "���̴� ������ ��ȣ�ڰ� �־ ������";
			} else if (withParent=='N'+'n'){
				result = "���̰� ���� ��ȣ�ڵ� ��� ���� �Ұ�";
			} else {
				System.out.println("�̻��� ���Դϴ�.");
				
			} 
		}
		System.out.printf("����: %d, ��ȣ�� ����: %c, ���: %s",
							age, withParent, result);
		scan.close();
	}
}
