package ch05;

import java.util.Scanner;


public class NestedIf {
	public static void main(String[] args) {
		String result ="";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요.");
		int age = scan.nextInt();
		
		System.out.println("보호자가 동반하나요?");
//		boolean withParent = scan.nextBoolean();
//		String withParent = scan.next();
		char withParent = scan.next().charAt(0);
		
		if (age >= 12) {
			result = "관람가";
		} else {
			if (withParent=='Y'+'y') {
				result = "나이는 적지만 보호자가 있어서 관람가";
			} else if (withParent=='N'+'n'){
				result = "나이가 적고 보호자도 없어서 관람 불가";
			} else {
				System.out.println("이상한 값입니다.");
				
			} 
		}
		System.out.printf("나이: %d, 보호자 동반: %c, 결과: %s",
							age, withParent, result);
		scan.close();
	}
}
