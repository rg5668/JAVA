package ch06;

public class Exam_7 {
	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);
		
		System.out.print(num+"ÀÇ ¾à¼ö :");
		
		for (int i = 1; i < num; i++) {
			if (num%i == 0) { 
				System.out.print(i+ " ");
			}
		}
			System.out.println();
	}
}
