package ch06;

import java.util.Scanner;

public class Exam17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�迭�� row���� �Է��ϼ���");
		int row = scan.nextInt();
		System.out.println("�迭�� column���� �Է��ϼ���");
		int col = scan.nextInt();
		
		int [][] arr = new int [row][col];
		
		int sub = row*col;	//�Է� ���� col�� row�� ���� ���� sub�� �ִ´�.
		
		for (int i = 0; i < row; i++) {	//�Է� ���� row ����ŭ �ݺ�
			for (int j = 0; j < col; j++) { //�Է� ���� col ����ŭ �ݺ�
				arr[i][j] += sub--;			//�Է¹��� row*col�� --�� 1�� ����
				System.out.print(arr[i][j]+"\t"); //�ϳ� ����ϰ� tab
			}
			System.out.println();	
			//j�� ����ŭ �� �ݺ��Ǹ� i�� �ٽ� �����ؼ� ����
		}
		
	}
}
