package ch06;

public class Exam15 {
	public static void main(String[] args) {
		int [][] score = {
				{90,80,70},
				{95,85,75},
				{70,80,75},
				{75,70,85},				
				{70,75,80},
				};
		int [][] result = new int[score.length+1][score[0].length+1]; //score �÷� �߰�, row �߰�
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				result[i][j] = score[i][j];	//������� ���ؿϷ�
				result[i][score[i].length] += score[i][j];// �ο�ǳ��ڸ��� ���ϴ°�(0123)
				result[score.length][j] += score[i][j];//�÷� ���ڸ��� ���ϴ°�
				result[score.length][score[i].length] += score[i][j]; //�ο�� �÷� ������ ���� ������ ���� (row �� ��ģ��)
			}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%6d", result[i][j]); //%nd�� �ڸ����� Ȯ���ϰ� ���������� �̴°�
			}
			System.out.println();
		}
	}
}
