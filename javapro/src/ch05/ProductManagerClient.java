package ch05;

import java.util.Scanner;

public class ProductManagerClient {
	private final String line = "******************************";
	String mainMenu = "��Ȳ��ȸ(L)\t��ǰ���(R)\t��ǰ�Ǹ�(S)\t����(X)";
	Scanner scan = new Scanner(System.in);
	
	private void displayMainMenu() {
		do {
			System.out.printf("%s%n%s%n%s%n", line, mainMenu, line);	//���ڿ�, �ٹٲ�, �޴�, �ٹٲ�, ���ڿ�
			String input = scan.nextLine();
			if (input.equalsIgnoreCase("X")) { //equalsIgnoreCase ��ҹ��� ���о��� ������
				System.out.println("�����մϴ�.");
				return;
			} else if (input.equalsIgnoreCase("L")) {
				System.out.println("��Ȳ�� ��ȸ�մϴ�.");
			} else if (input.equalsIgnoreCase("S")) {
				System.out.println("��Ȳ�� ��ȸ�մϴ�.");
			} else if (input.equalsIgnoreCase("R")) {
				System.out.println("��Ȳ�� ��ȸ�մϴ�.");
			} else {
				System.out.println("������ �޴��� �ƴմϴ�.");
			}
		} while (true);
	}
	public static void main(String[] args) {
		ProductManagerClient pmc = new ProductManagerClient();
		pmc.displayMainMenu();
	}
}
