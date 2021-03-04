package ch06;

import java.util.Scanner;

public class Exam17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("배열의 row수를 입력하세요");
		int row = scan.nextInt();
		System.out.println("배열의 column수를 입력하세요");
		int col = scan.nextInt();
		
		int [][] arr = new int [row][col];
		
		int sub = row*col;	//입력 받은 col과 row의 곱한 값을 sub에 넣는다.
		
		for (int i = 0; i < row; i++) {	//입력 받은 row 값만큼 반복
			for (int j = 0; j < col; j++) { //입력 받은 col 값만큼 반복
				arr[i][j] += sub--;			//입력받은 row*col에 --로 1씩 빼기
				System.out.print(arr[i][j]+"\t"); //하나 출력하고 tab
			}
			System.out.println();	
			//j가 수만큼 다 반복되면 i가 다시 증감해서 시작
		}
		
	}
}
