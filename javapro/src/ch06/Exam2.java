package ch06;

public class Exam2 {
	public static void main(String[] args) {
		int [] arr = new int[10];	// arr에 길이 10짜리 배열을 선언
		
		for (int i = 0; i < arr.length; i++) {	//i는 0부터 시작하고 i가 arr.length[10]보다 클 경우 반복 중단(9)
			arr[i] = (int) (Math.random() * 10 ) + 1;	
			//arr[길이]에 묵시적형변환 int를 넣고 random함수를 넣어 숫자 넣기
			//random은 0.0 ~ 1.0까지여서 (1~10까지 출력) 뒤에 +1을 함
		}
			for (int a : arr) {		//for each구문 a에 arr 값을 넣는다 
				System.out.print(a + ":");	//몇번째가 전달이 됬는지 출력 ex) 2:
				for (int i = 0; i < a; i++) {	//중첩 for문을 써서 a에 10이 들어오데 i는 0~9까지 돌림
					System.out.print("*");		// *를 갯수만큼
				}
				System.out.println();			//ln은 한번 for문이 끝나면 줄바꿈
			}
		}
	}
