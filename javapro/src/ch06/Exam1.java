package ch06;

import java.util.Scanner;

public class Exam1 {
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	// 스캐너를 이용해 키보드로 받을 수 있는 변수 선언
		int [] score = new int [5];				// 스코어 배열 길이 5개 짜리 선언
		int sum = 0, max = 0, min = Integer.MAX_VALUE;	
		//합계, 비교를 위한 맥스, 미니엄 선언 맥스는 Integer.MIN_VALUE로 선언해도됨 민은 MAX
		
		System.out.println(Integer.MAX_VALUE+","+Integer.MIN_VALUE);	//최대값과 -최저값 출력
		System.out.println("5명의 점수를 입력하세요");
		
		for (int i = 0; i < score.length; i++) { //i가 score.length(5)보다 작을 경우 돌린다
			score[i] = scan.nextInt();			//키보드로 입력해 score에 값을 전달연결
			sum += score[i];					//값을 전달연결 받은걸 sum에 축적저장
			if(max < score[i]) max = score[i];	//만약 max가 들어온 값(score[i])보다 작을 경우 아래 조건 실행
			if(min > score[i]) min = score[i];	//만약 min이 들어온 값(score[i])보다 클 경우 아래 조건 실행
		}
		
		System.out.println("합계:" + sum);
		System.out.println("평균:" + (double)sum/score.length);	//평균은 소수점이 나와야하니깐 double로 명시적 형변환(묵시적X)
		System.out.println("최대점수:" + max);	//비교값 출력
		System.out.println("최소점수:" + min);// 비교값 출력
	}
}
