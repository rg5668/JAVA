package ch09_2;

interface Printerable {
	int INK = 100;	//static ���� ����
	void print();	//�߻� �޼���
}

interface Scannerable {
	void scan();
}

interface Faxable {
	String FAX_NO = "010-12345";
	
	void send(String tel);
	void receive(String tel);
}
interface Complexerable extends Printerable,Scannerable,Faxable {
	
}

class Complexer implements Complexerable {
	int ink;
	
	Complexer() {
		this.ink = INK;
	}

	@Override
	public void print() {
		System.out.println("���̿� ����մϴ�. ���� ��ũ��:" + --ink);
	}

	@Override
	public void scan() {
		System.out.println("�̹����� ��ĵ�մϴ�.");
	}

	@Override
	public void send(String tel) {
		System.out.println(FAX_NO + "���� " + tel + "��ȣ�� FAX�� �����մϴ�.");
	}

	@Override
	public void receive(String tel) {
		System.out.println(tel + "���� " + FAX_NO + "�� FAX�� �޾ҽ��ϴ�.");
	}
}
public class ComplexerEx1 {
	public static void main(String[] args) {
		Complexer com = new Complexer();
		System.out.println("�⺻ ��ũ��:" + Printerable.INK);
		System.out.println("FAX ��ȣ" + Complexerable.FAX_NO);
		com.print();
		com.scan();
		com.receive("02-5678");
		com.send("02-5678");
	}
}
