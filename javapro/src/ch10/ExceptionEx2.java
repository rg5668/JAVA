package ch10;

public class ExceptionEx2 {
	public static void main(String[] args) {
		try {
			//ArrayIndexOutOfBoundsException ���� �߻�
			System.out.println(args[0]);	//1)�Է¾���
			//NumberFormatException ���� �߻�
			System.out.println(Integer.parseInt(args[0]));	//2) a
			System.out.println(10 / Integer.parseInt(args[0])); //3) 0
			String str = null;
			System.out.println(str.charAt(0));	//NullPointerException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("command ���ο� �Ķ���͸� �Է��ϼ���");
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ ������");
		} catch (NullPointerException e) {
			System.out.println("Null �Դϴ�.");
		} catch (NumberFormatException e) {
			System.out.println("command ���ο� ���ڷ� �Է��ϼ���");
		} catch (RuntimeException e) {
			System.out.println("1.�����߻� : ����η� ��ȭ���");
		} catch (Exception e) {
			System.out.println("2.�����߻� : ����η� ��ȭ���");
		}
	}
}
