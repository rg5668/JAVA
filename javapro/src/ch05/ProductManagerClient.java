package ch05;

import java.util.Scanner;

public class ProductManagerClient {
	private final String line = "******************************";
	String mainMenu = "현황조회(L)\t상품등록(R)\t상품판매(S)\t종료(X)";
	Scanner scan = new Scanner(System.in);
	
	private void displayMainMenu() {
		do {
			System.out.printf("%s%n%s%n%s%n", line, mainMenu, line);	//문자열, 줄바꿈, 메뉴, 줄바꿈, 문자열
			String input = scan.nextLine();
			if (input.equalsIgnoreCase("X")) { //equalsIgnoreCase 대소문자 구분없이 구별함
				System.out.println("종료합니다.");
				return;
			} else if (input.equalsIgnoreCase("L")) {
				System.out.println("현황을 조회합니다.");
			} else if (input.equalsIgnoreCase("S")) {
				System.out.println("현황을 조회합니다.");
			} else if (input.equalsIgnoreCase("R")) {
				System.out.println("현황을 조회합니다.");
			} else {
				System.out.println("적절한 메뉴가 아닙니다.");
			}
		} while (true);
	}
	public static void main(String[] args) {
		ProductManagerClient pmc = new ProductManagerClient();
		pmc.displayMainMenu();
	}
}
