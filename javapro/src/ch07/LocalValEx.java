package ch07;

public class LocalValEx {//Ŭ������
	//		Ŭ������ ������
	static String grade2; //static�� Ŭ������.���������� ��밡��
	
	public static void main(String[] args) {
		int num = 200;	//��������
		boolean b = true;	//��������
		if(b) num = 100;	//b�� Ʈ��� num�� 100
		System.out.println(num); ////Ŭ����.����.�޼ҵ�(�Ķ��Ÿ)
		String grade; //==���ú���
		int score = 50;	//��������
		switch(score/10) {
		case 9 : grade = "A"; break;//��� : ���� = �Ķ��Ÿ;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		default : grade = "F"; break;
		}
		System.out.println("���� :" + grade);
	}
}
