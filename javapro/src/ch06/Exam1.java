package ch06;

import java.util.Scanner;

public class Exam1 {
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	// ��ĳ�ʸ� �̿��� Ű����� ���� �� �ִ� ���� ����
		int [] score = new int [5];				// ���ھ� �迭 ���� 5�� ¥�� ����
		int sum = 0, max = 0, min = Integer.MAX_VALUE;	
		//�հ�, �񱳸� ���� �ƽ�, �̴Ͼ� ���� �ƽ��� Integer.MIN_VALUE�� �����ص��� ���� MAX
		
		System.out.println(Integer.MAX_VALUE+","+Integer.MIN_VALUE);	//�ִ밪�� -������ ���
		System.out.println("5���� ������ �Է��ϼ���");
		
		for (int i = 0; i < score.length; i++) { //i�� score.length(5)���� ���� ��� ������
			score[i] = scan.nextInt();			//Ű����� �Է��� score�� ���� ���޿���
			sum += score[i];					//���� ���޿��� ������ sum�� ��������
			if(max < score[i]) max = score[i];	//���� max�� ���� ��(score[i])���� ���� ��� �Ʒ� ���� ����
			if(min > score[i]) min = score[i];	//���� min�� ���� ��(score[i])���� Ŭ ��� �Ʒ� ���� ����
		}
		
		System.out.println("�հ�:" + sum);
		System.out.println("���:" + (double)sum/score.length);	//����� �Ҽ����� ���;��ϴϱ� double�� ����� ����ȯ(������X)
		System.out.println("�ִ�����:" + max);	//�񱳰� ���
		System.out.println("�ּ�����:" + min);// �񱳰� ���
	}
}
