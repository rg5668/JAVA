package ch05;

public class test {
	public static void main(String[] args) {
		int sum=0;
		
		for (int i = 1; i <= 100; i++) {
			if (i%2==0 || i%3==0) {
				sum += i;
				System.out.print(" " + i);
			}
		}
		System.out.println();
		System.out.println("2�� 3�� ����� �� :" + sum);
		
		sum = 0;
		
		for (int j = 1; j <= 100; j++) {
			if (j%2!=0 || j%3!=0) {
				sum += j;				
				System.out.print(" " + j);
				continue;
			}
		}
		System.out.println();
		System.out.println("2�� 3�� ����� �ƴѼ��� �� :" + sum);
	}
}
