package ch10;
/*
 * finally ���� : ���� ����, ���ܽ��� ��� �����
 * 				try, catch �������� return ������ ������ finally�� �����.
 */
public class ExceptionEx3 {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3/0);
			//return; //�޼��� ����
		} catch (Exception e) {
			System.out.println(4);
			return;	//�޼��� �������ͼ� ����ǵ� finally�� �����
		} finally {
			System.out.println("finally:" + 5);
		}
		System.out.println(6);
	}
}
