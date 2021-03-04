package ch12_01;
/*
 * count 메서드 구현하기.
 * int count("문자열소스","찾는 문자열") : 문자열 소스에서 찾는 문자열의 갯수를 리턴
 */
public class Exam1 {
	//a="12345", b="6"
	static int count(String a, String b) {
		int idx = 0, cnt = 0;
		//idx는 0번 순부터 찾아라
		//cnt는 카운트 리턴
		while(true) {
			idx = a.indexOf(b, idx); //0 //입력되는 수가 몇번 들어가는지
			System.out.println(idx);
			if (idx == -1)
				break;
			idx++;
			cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB","12"));//2
		System.out.println(count("12345AB12AB345AB","AB"));//3
		System.out.println(count("12345","6")); //0
	}
}
