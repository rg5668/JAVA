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
		int [][] result = new int[score.length+1][score[0].length+1]; //score 컬럼 추가, row 추가
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				result[i][j] = score[i][j];	//여기까진 이해완료
				result[i][score[i].length] += score[i][j];// 로우맨끝자리에 더하는거(0123)
				result[score.length][j] += score[i][j];//컬럼 끝자리에 더하는거
				result[score.length][score[i].length] += score[i][j]; //로우와 컬럼 만나는 지점 마지막 총합 (row 다 합친값)
			}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%6d", result[i][j]); //%nd는 자릿수를 확보하고 오른쪽으로 미는거
			}
			System.out.println();
		}
	}
}
