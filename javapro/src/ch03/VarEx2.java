package ch03;

/*
 * ����ȯ ����  
 *   ū�ڷ���<=���� �ڷ��� : �ڵ�����ȯ
 *   �����ڷ��� <= ū�ڷ��� : ����� ����ȯ
 *   
 *   byte < short < int < long < float < double
 *          char
 *          
 *  A=B : ���� �� �ǹ̰� �ƴϰ�, ������ �ǹ���.
 *        B�� ���� A�� �Է���.
 *  lvalue : ���Կ������� ������ ��. �ݵ�� ����������.
 *  rvalue : ���Կ������� �������� ��, ����, ���ͳ�, ���� ����             
 */
public class VarEx2 {
	public static void main(String[] args) {
		int a = 10;
		//1. �������� �⺻���� ����ȯ �Ұ�
		String s = "a"; //"" : ���ڿ�,String, ' ':����, char
		//s = 'a'; //�������� String �⺻���� char ���� ��ȯ �Ұ�.
		//2. �⺻�� ���̿�  boolean�� ������ 7���� ���� ����ȯ�� ������
		byte b1 = (byte)255; //255: 11111111  -> 1111  -> 111-111+1 
		int i1 = b1; // int <= byte ����ȯ��. �ڵ�����ȯ
		byte b2 =  (byte) i1;// byte <= byte ����ȯ��. ���������ȯ
		System.out.println("b1="+b1+", i1="+i1);
		byte b3 = 100;
		System.out.println("b3="+b3);
		long l1 = 10;		float f1 = l1; long l2 = (long) f1;
		char c1 = 'A';		short s1 = (short)c1;		char c2 = (char)b1;
		// ū�ڷ���=ū�ڷ��� + �����ڷ���
		int i2 = (int)(i1 + l1);
		System.out.println("i2 =" + i2);
		// String = String + �⺻�ڷ���
		System.out.println("��ȣ:" + 1 + 2 + 3);
		System.out.println(1 + 2 + 3 + "��");
		char c3 = 'A'; //�ƽ�Ű�ڵ尪 65
		int i3 = c3;
		System.out.println("c3=" + c3 + ",i3=" + (char)i3);
		//int���� ���� �ڷ����� ������ ����� int
		int b4;		byte b5=1;		byte b6=2;		b5 = (byte)(b5+b6);
	}
}
