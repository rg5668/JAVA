package ch10;
/*
 * ���� Ŭ���� ����
 * �ν��Ͻ� ����Ŭ���� : static Ŭ���� ����� ���� �� ����. �� ����� ����
 * static ����Ŭ���� : static Ŭ���� ����� ���� �� �ִ�.
 * ��������Ŭ����	: �޼��� ���� ����� Ŭ����. �޼��� ���ο����� ����� ������.
 * �̸�����(������)����Ŭ���� : Ŭ���� ���� ��üȭ ������ Ŭ����
 * 						�߻�Ŭ����, �������̽��� ��üȭ ������.
 */

class Outer1 {
	class InstanceInner {	//�ν��Ͻ� ���� Ŭ����
		int iv = 100;
//		static int cv = 10;	//Ŭ���� ����� ���� �� ����
		final static int MAX = 200;	//����� Ŭ���� ����� ���� �� �ִ�.
	}
	static class StaticInner {		//static ����Ŭ����
		int iv = 300;
		static int cv = 400;	//Ŭ���� ����� ���� �� �ִ�.
		final static int MAX = 500;
	}
	void method() {
		class LocalInner {	//���� ���� Ŭ����
			int iv = 600;
//			static int cv = 700;	//Ŭ���� ����� ���� �� ����.
			final static int MAX = 700;	//����� ����
		}
		LocalInner Ic = new LocalInner();
		System.out.println(Ic.iv);	//600
		System.out.println(Ic.MAX);	//700
		System.out.println(LocalInner.MAX);	//700
	}
	void method2() {
//		LocalInner Ic = new LocalInner(); //=> LocalInner Ŭ������ method() �޼��忡���� ��밡��
		
	}
}
public class InnerEx1 {
	public static void main(String[] args) {
		Outer1.StaticInner si = new Outer1.StaticInner();
		System.out.println(si.iv);	//300
		System.out.println(Outer1.StaticInner.cv);	//400
		System.out.println(Outer1.StaticInner.MAX);	//500
//		Outer1.InstanceInner li = new Outer1().InstanceInner();
		Outer1.InstanceInner ii = new Outer1().new InstanceInner();
		Outer1 outer = new Outer1();
		Outer1.InstanceInner ii2 = outer.new InstanceInner();
		System.out.println(ii2.iv);	//100
		System.out.println(Outer1.InstanceInner.MAX);	//200
		outer.method();	//600,700,700
		outer.method2();	//X
	}
}
