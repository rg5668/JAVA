package ch06;

public class Exam8 {
	public static void main(String[] args) {
			if (args.length != 2) {
			System.out.println("command line에 두개의 파리미터만 입력하세요");
			System.out.println("java Exam8 12 15");
			return;
		}
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			
			int min = (num1>num2)?num2:num1;
			
			for (int i = 1; i <= min; i++) {
				if (num1%i == 0 && num2%i == 0) {
					System.out.print(i + ",");
				}
			}
	}
}