package ch07;

//1. ��� Ŭ������ Object�� ������ �ִ�
//2. ���������� ����Ʈ �ÿ��� toString() �޼ҵ带 ����Ʈ �Ѵ�

public class JavaObject {
	public static void main(String[] args) {
		
		Aaa a1 = new Aaa();
		Object o = new Object();
		System.out.println(o);
		System.out.println(a1);
	}
}

class Aaa{ // extend Object�� �ѰŶ� �Ȱ���(����) 
	//(Object�ȿ� toString�� ����)
	int num = 303030;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return num+"�Դϴ�";
	}
}