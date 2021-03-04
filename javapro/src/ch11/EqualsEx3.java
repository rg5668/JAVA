package ch11;

public class EqualsEx3 {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");//스트링은 오브젝트를 오버라이딩 한거
		
		if (s1 == s2) {
			System.out.println("s1문자열 객체와 s2문자열 객체는 같은 객체임");
		}else {
			System.out.println("s1문자열 객체와 s2문자열 객체는 다른 객체임");
		}
		if (s1.equals(s2)) {
			System.out.println("s1문자열 객체와 s2문자열은 같은 문자열임");
		}else {
			System.out.println("s1문자열 객체와 s2문자열은 다른 문자열임");
		}
	}
}
