package ch05;

public class LoopEx5 {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			System.out.println("\n"+i+"단");
			for (int j = 2; j <= 9; j++) {
				if(j==5) continue; 
				// 5단만 빼고 조건 실행(반복문의 처음으로 제어를 이동)
//				if(j==5) break; 
				// 구문에서 빠져나옴
				
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}
}
