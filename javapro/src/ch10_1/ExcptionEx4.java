package ch10_1;

/*
 * throws ���� ó��
 * throws Exception�� ó���� �޼ҵ�� ���� �޼ҵ忡�� ó�� �Ͽ�����
 * �� RuntimeException�� ó�� ���� �ʾƵ� ��
 */
public class ExcptionEx4 {
	public static void main(String[] args) {
		
		try {
			first();
		} catch (Exception e) {
			// TODO: handle exception
			//e.printStackTrace();
			System.out.println("����ó��");
		}
	}
	
	private static void first() throws Exception {
		second();
	}
	
	private static void second() throws Exception {
		System.out.println("second �޼���");
		// NumberFormatException ���� �߻�
		System.out.println(Integer.parseInt("abc"));
	}
}
