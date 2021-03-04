package ch04;

import java.util.Scanner;

public class Exam7 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		//내답안
		String result = score >= 90 ? "A" : score >= 80 ? "B" :
			score >= 70 ? "C" : score >= 60 ? "D" :"F";
		System.out.println("입력한 점수는 " + score + "학점은 "+  result);
		
		//강사님 답안	//조건 ? 참 : 거짓
		System.out.println(score + "점수는 "+((score>=90) ? "A":
			(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F"));
	}
}
