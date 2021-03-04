package ch07;

public class LocalValEx {//클래스명
	//		클래스명 변수명
	static String grade2; //static은 클래스명.변수명으로 사용가능
	
	public static void main(String[] args) {
		int num = 200;	//지역변수
		boolean b = true;	//지역변수
		if(b) num = 100;	//b가 트루면 num에 100
		System.out.println(num); ////클래스.변수.메소드(파라메타)
		String grade; //==로컬변수
		int score = 50;	//지역변수
		switch(score/10) {
		case 9 : grade = "A"; break;//제어문 : 변수 = 파라메타;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		default : grade = "F"; break;
		}
		System.out.println("학점 :" + grade);
	}
}
