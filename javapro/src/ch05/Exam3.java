package ch05;

public class Exam3 {
	public static void main(String[] args) {
//		for (int i = 2; i <= 9; i++) {
//			System.out.print(i + "��\t");
//		}
//		System.out.println();
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 2; j <= 9; j++) {
//				System.out.print(j + "*" + i + "=" + (j*i) + "\t");
//			}
//			System.out.println();
//		}
		for (int i = 2; i <= 9; i++) { //���η� ���� 9�ܱ��� �ϸ� �ٹٲ����� ����
			
			for (int j = 2; j <= 9; j++) { //2~9�ܱ��� *2~9 �� ����
				System.out.print(j+"*"+i+"="+j*i+"\t"); //������ ����
			}
			System.out.println(); //�ٹٲ�
		}
	}
}
