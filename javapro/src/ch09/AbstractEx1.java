package ch09;
//�߻� Ŭ�������� ��ӵ� ������.
//�߻�Ŭ������ �ڼ� Ŭ������ ��� ������ �߻� �޼��带 ������ ���ص���
//�� �߻� Ŭ������ ��ӹ��� �Ϲ� Ŭ������ ��� �߻� �޼��带 �����ؾ� ��.
abstract class Abs1 {
	int a = 10;
	protected abstract int getA();
}
abstract class Abs2 extends Abs1 {
	int b = 20;
	protected abstract int getB();
}
class Normal extends Abs2 {
	@Override
	protected int getB() {
		return b;
	}
	@Override
	protected int getA() {
		return a;
	}
}
public class AbstractEx1 {
	public static void main(String[] args) {
		Abs1 a1 = new Normal();
		System.out.println(a1.getA()); // 10
		//System.out.println(a1.getB()); //error
		
		Abs2 a2 = (Abs2) a1;
		System.out.println(a2.getA());
		System.out.println(a2.getB());
		
		Normal n = (Normal) a2;
		System.out.println(n.getA());
		System.out.println(n.getB());
		
		Normal n1 = new Normal();
		System.out.println(n1.getA());
		System.out.println(n1.getB());
		//a2 = new Abs2(); //error. �߻� Ŭ������ ��üȭ �Ұ�
	}
}
