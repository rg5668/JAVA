package ch05;

//import java.util.Random;
import java.util.Scanner;

public class IfElseTest {
	public static void main(String[] args) {
		
		
		String result = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("ū��? ������?");
//		Random myRandom = new Random();
		
//		System.out.println("ū��? ������?");
//		int num1 = myRandom.nextInt(100);
		int num1 = scan.nextInt();
		if (num1 >= 50) {
			result = "ū ��";
		} else {
			result = "���� ��";
		}
		System.out.printf("%d�� %s�̴�%n", num1, result);
		
		System.out.println("¦���ϱ�?");
//		int num2 = myRandom.nextInt(10);
		int num2 = scan.nextInt();
		
		if (num2 % 2 == 0) {
			result = "¦��";
		} else {
			result = "Ȧ��";
		}
		System.out.printf("%d�� %s�Դϴ�.%n", num2, result);
		
		//���� ������(���Ǻ� ������)�� �̿��ϴ� ����
		result = (num2 % 2 == 0) ? "¦��" : "Ȧ��";
		System.out.printf("%d�� %s�Դϴ�.%n", num2, result);
	}
}
