package ch06;

public class ArrayTest {
	public static void main(String[] args) {
		int [] timesTable = new int [9];
		for (int i = 0; i < timesTable.length; i++) {
			timesTable[i] += 3 * (i + 1);
		}
		System.out.println("�迭 ���� �Ϸ�");
		
		int sum = 0;
		for (int i = 0; i < timesTable.length; i++) {
			if (i % 2 == 0) {
				sum += timesTable[i];
			}
		}
		System.out.printf("Ȧ�� ��° ��ҵ��� ����: %d%n", sum);
	}
}
