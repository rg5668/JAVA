package ch09;

import ch09_1.Modifier2;

//���� ������
//				private	<	(default) <	protected <	public
//����package:	����calss			O			O			O
//�ٸ�package:		X			X		  ��Ӱ���			O
class Modifier {
	private int v1 = 100;
			int v2 = 200;
	protected int v3 = v1;
	public void method() {
		System.out.println("chap8.Modifier.method() �޼�����");
		System.out.println("v1 =" + v1);
		System.out.println("v2 =" + v2);
	}
}
class Modifier3 extends Modifier2 {
	public void method() {
		//System.out.println("v1 =" + v1);	//v1 ������ ���������ڰ� private��
		//System.out.println("v2 =" + v2);	//v2 ������ ���������ڰ� (default)��
		System.out.println("v3 =" + v3);	//v3 ������ ���������ڰ� protected��
		System.out.println("v4 =" + v4);	//��� ���� ���
	}
}
public class ModifierEx1 {
	public static void main(String[] args) {
		Modifier m1 = new Modifier();
//		System.out.println(m1.v1);	//���� �Ұ�
		System.out.println(m1.v2);
		System.out.println(m1.v3);
		m1.method();
		Modifier3 m3 = new Modifier3();
		m3.method();
//		System.out.println("m3.v1="+m3.v1);
//		System.out.println("m3.v2="+m3.v2);
//		System.out.println("m3.v3="+m3.v3);
		System.out.println("m3.v4="+m3.v4);
		
		//Math m = new Math();	//�������� ���� �����ڰ� private��. ��ü���� �Ұ�
	}
}
