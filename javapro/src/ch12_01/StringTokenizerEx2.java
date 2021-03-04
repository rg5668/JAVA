package ch12_01;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {
	public static void main(String[] args) {
		String expression = "x=100*(200+300)/2";
		StringTokenizer st =
				new StringTokenizer(expression, "+-*/=()", true);
				//StringTokenizer 투르이면 연산 하나씩 찍기
				//flaus 면 안찍음
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
