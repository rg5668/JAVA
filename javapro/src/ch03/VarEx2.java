package ch03;

/*
 * 형변환 예제  
 *   큰자료형<=작은 자료형 : 자동형변환
 *   작은자료형 <= 큰자료형 : 명시적 형변환
 *   
 *   byte < short < int < long < float < double
 *          char
 *          
 *  A=B : 같다 의 의미가 아니고, 대입의 의미임.
 *        B의 값을 A에 입력함.
 *  lvalue : 대입연산자의 왼쪽의 값. 반드시 변수여야함.
 *  rvalue : 대입연산자의 오른쪽의 값, 변수, 리터널, 수식 가능             
 */
public class VarEx2 {
	public static void main(String[] args) {
		int a = 10;
		//1. 참조형과 기본형은 형변환 불가
		String s = "a"; //"" : 문자열,String, ' ':문자, char
		//s = 'a'; //참조형인 String 기본형인 char 형이 변환 불가.
		//2. 기본형 사이에  boolean을 제외한 7개는 서로 형변환이 가능함
		byte b1 = (byte)255; //255: 11111111  -> 1111  -> 111-111+1 
		int i1 = b1; // int <= byte 형변환됨. 자동형변환
		byte b2 =  (byte) i1;// byte <= byte 형변환됨. 명시적형변환
		System.out.println("b1="+b1+", i1="+i1);
		byte b3 = 100;
		System.out.println("b3="+b3);
		long l1 = 10;		float f1 = l1; long l2 = (long) f1;
		char c1 = 'A';		short s1 = (short)c1;		char c2 = (char)b1;
		// 큰자료형=큰자료형 + 작은자료형
		int i2 = (int)(i1 + l1);
		System.out.println("i2 =" + i2);
		// String = String + 기본자료형
		System.out.println("번호:" + 1 + 2 + 3);
		System.out.println(1 + 2 + 3 + "번");
		char c3 = 'A'; //아스키코드값 65
		int i3 = c3;
		System.out.println("c3=" + c3 + ",i3=" + (char)i3);
		//int보다 작은 자료형의 연산의 결과는 int
		int b4;		byte b5=1;		byte b6=2;		b5 = (byte)(b5+b6);
	}
}
