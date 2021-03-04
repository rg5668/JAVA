package ch14_02;

import java.util.Set;
import java.util.TreeSet;
/*
 * TreeSet 예제 : 중복불가, 정렬
 * Lotto 번호 생성기 TreeSet을 이용하여 출력하기
 * 0 ~ 45까지의 랜덤한 4개의 수를 순서 적용하여 프린트한다.
 * ex) 3,12,34,36
 */
public class Exam3 {
	public static void main(String[] args) {
		System.out.println("Lotto 번호 ======");
		Set<Integer> ball = new TreeSet<Integer>();

		while(ball.size() < 4) {
			ball.add((int)(Math.random()*45)+1);
		}
		System.out.println(ball);
	}
}
