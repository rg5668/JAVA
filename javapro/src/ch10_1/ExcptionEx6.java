package ch10_1;

/*
 * throws ���� ó�� : �߻��� ���ܸ� ���� method�� �����ϱ�.
 * throw : new ���ܹ߻� : ���� ���� �߻�
 */
public class ExcptionEx6 {
	public static void main(String[] args) {
		try {
			throw new Exception("���� ���� �߻�");
		} catch (Exception e) {
			System.out.println("���� ���� �߻�2");
		}
	}
}
