package ch12;
/*
 * ������ ���ڿ� ���ڷ� ����
 * parseXXX() �޼���
 */
public class WrapperEx3 {
	public static void main(String[] args) {
		int is = Integer.parseInt("123");	//�ڽ�
		System.out.println(is);
		is = Integer.parseInt("123",8); //123�� 8������ �ν�
		System.out.println(is);
		is = Integer.parseInt("123",16); //123�� 16������ �ν�
		System.out.println(is);
		float f = Float.parseFloat("123.45");
		System.out.println(f);
		f = Float.parseFloat("123.45f");
		System.out.println(f);
		double d = Double.parseDouble("123.45");
		System.out.println(d);
		System.out.println(Integer.toBinaryString(500));//2����
		System.out.println(Integer.toOctalString(500));//8����
		System.out.println(Integer.toHexString(500));//16����
		
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toOctalString(10));
		System.out.println(Integer.toHexString(10));
		
		Float f2 = 123.45f;
	}
}
