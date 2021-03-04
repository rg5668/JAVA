package ch12;
/*
 * StringBuffer는 리터럴 대입이 불가함
 * StringBuffer는 값이 계속 저장이됨.
 * 메소드(append) 로 추가하여야함
 * append시 참조형 변수가 바뀌지 않음.
 */
public class StringBufferEx2 {
	public static void main(String[] args) {
//		StringBuffer sb = "01"; //리터럴 대입이 불가
		StringBuffer sb = new StringBuffer("01");	//100번지
		
		StringBuffer sb2 = sb.append(23);
		sb2.append('4').append(56);
		
		StringBuffer sb3 = sb.append(78);
		sb3.append(9.0);
		
		System.out.println("sb ="+sb);
		System.out.println("sb2 ="+sb2);
		System.out.println("sb3 ="+sb3);
		System.out.println("sb.deleteCharAt" + sb.deleteCharAt(10));//10번째순번꺼삭제
		System.out.println("sb.delete =" + sb.delete(3, 6));	//3이상에서 6이전(5)까지
		System.out.println("sb.insert =" + sb.insert(3, "abc"));//3이상에서 문자열로 바꿈
		System.out.println("sb.replace ="
		+ sb.replace(6, sb.length(), "END"));	//6이상에서는 END로 찍기
		System.out.println("sb.capacity =" + sb.capacity());//길이의 두배 메모리
		System.out.println("sb.length" + sb.length());//길이
		
		sb.delete(0,sb.length());
		System.out.println("초기화된 sb =" + sb);
	}
}
