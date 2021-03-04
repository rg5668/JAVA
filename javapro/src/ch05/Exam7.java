package ch05;

public class Exam7 {
	public static void main(String[] args) {
		int a = 0;
		int sum = 0;
		
		for (a = 1; a <= 100; a++) {
			if (a%2==0 || a%3==0) {
				System.out.print(a + " ");
				sum += a;
			}
		}
		System.out.println();
		System.out.println("2와 3의 배수의 합 :" + sum);
		
		sum = 0;
		
		for (a = 1;  a<=100; a++) {
			if (a%2==0 || a%3==0) {
				continue;
			} else {
				System.out.print(a + " ");
			}
			sum += a;
		}
		System.out.println();
		System.out.println("2와 3의 배수가 아닌수의 합 : " + sum);
	}
}
