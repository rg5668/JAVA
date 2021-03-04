package ch12_01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//정규표현식
public class RegularEx1 {
	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bonus",
				"cA","ca","co","c.","c0","caaCC",
				"car","combat","count","date","disc"};
		//c로 시작하는 소문자영어 모두 출력
		//compile 주어진 정규표현식으로부터 패턴을 만듭니다.
		Pattern p = Pattern.compile("c[a-z]*"); //패턴
		
		for (int i = 0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]);	//매치
			if (m.matches()) { 
//matches대상 문자열과 패턴이 일치할 경우 true 반환합니다
				System.out.print(data[i] + ", ");
			}
		}
		}
	}
