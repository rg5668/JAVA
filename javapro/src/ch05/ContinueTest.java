package ch05;

public class ContinueTest {
	public static void main(String[] args) {
		System.out.println("1 ~ 1000������ ���� �� 3�� ����� ����?");
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 3 > 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1 ~ 1000������ ���� �� 3�� ����� ����" + sum);
	}
}
