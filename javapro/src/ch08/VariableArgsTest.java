package ch08;

public class VariableArgsTest {
	public void add(int... params) {
		int sum = 0;
		for (int i : params) {
			sum += i;
		}
		System.out.printf("�Ķ���� ����: %d, �� ��: %d%n",params.length,sum);
	}
	public static void main(String[] args) {
		VariableArgsTest vt = new VariableArgsTest();
		vt.add(1, 2, 3, 4, 5);
		vt.add(1, 2, 3);
		vt.add();
	}
}
