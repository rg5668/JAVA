package ch10_1;

public class ExcptionEx7 {
	public static void main(String[] args) {
		try {
			badmethod();
		} catch (Exception e) {
			System.out.println("main ���� ���� ó��");
//			e.printStackTrace();	//����ó���� ���� ����� ������
			// TODO: handle exception
		}
	}
	private static void badmethod() throws Exception {
		try {
			throw new Exception("���� ���� �߻�");
		} catch (Exception e) {
			System.out.println("badmethod ���� ���� ó��");
//			e.printStackTrace();
			throw e;	//�ٽ� �������� �ö�
			// TODO: handle exception
		}
	}
}
