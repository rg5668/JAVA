package ch05;

public class LoopEx2 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		System.out.println("for ������ �̿��ϱ�");
		for (i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1~10 ������ ��:" + sum);
		System.out.println("while ������ �̿��ϱ�");
		sum = 0;
		i = 1;
		while (i <= 10) {
			sum += i;
			i ++;
		}
		System.out.println("1~10 ������ ��:" + sum);
		System.out.println("do while ������ �̿��ϱ�");
		sum = 0;
		i = 1;
		do {
			sum += i;
			i++;
		} while (i <= 10);
		System.out.println("1~10������ ��:" + sum);
	}
}