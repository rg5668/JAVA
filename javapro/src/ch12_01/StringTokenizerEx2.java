package ch12_01;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {
	public static void main(String[] args) {
		String expression = "x=100*(200+300)/2";
		StringTokenizer st =
				new StringTokenizer(expression, "+-*/=()", true);
				//StringTokenizer �����̸� ���� �ϳ��� ���
				//flaus �� ������
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
