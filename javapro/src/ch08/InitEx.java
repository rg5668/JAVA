package ch08;

public class InitEx {
	static int cv;	//Ŭ���� ����
	int iv;			//�ν��Ͻ� ����
	InitEx() {		//������
		System.out.println("5. ������ ȣ���");
	}
	static {		//static �ʱ�ȭ ��
		cv = (int)(Math.random()*100);
		System.out.println("1. Ŭ���� �ʱ�ȭ �� cv="+cv);
		//iv = (int)(Math.random() * 100); //==error
	}
	{	//�ν��Ͻ� �ʱ�ȭ ��
		iv = (int)(Math.random()*100);
		System.out.println("4. �ν��Ͻ� �ʱ�ȭ ��. �����ں��� ���� ȣ���" + iv);
	}
	public static void name() {
		
	}
	public static void main(String[] args) {
		System.out.println("2. main �޼��� ����.");
		System.out.println("3. main init1 ��ü ����");
		InitEx init1 = new InitEx();
		name();
		System.out.println("main init2 ��ü ����");
		InitEx init2 = new InitEx();
	}
}
