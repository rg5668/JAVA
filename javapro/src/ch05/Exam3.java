package ch05;

public class Exam3 {
	public static void main(String[] args) {
//		for (int i = 2; i <= 9; i++) {
//			System.out.print(i + "단\t");
//		}
//		System.out.println();
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 2; j <= 9; j++) {
//				System.out.print(j + "*" + i + "=" + (j*i) + "\t");
//			}
//			System.out.println();
//		}
		for (int i = 2; i <= 9; i++) { //가로로 고정 9단까지 하면 줄바꿈으로 실행
			
			for (int j = 2; j <= 9; j++) { //2~9단까지 *2~9 로 찍음
				System.out.print(j+"*"+i+"="+j*i+"\t"); //탭으로 구분
			}
			System.out.println(); //줄바꿈
		}
	}
}
