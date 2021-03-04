package ch07;

public class PhoneEx2 {
	
	public static void main(String[] args) {
		Phone[] parr = new Phone[3];	//배열 3개 선언
		for (int i = 0; i < parr.length; i++) {//i가 0부터 3보다 작을때까지
			Phone p = new Phone();	//PhoneEx1에 있는 클레스 생성자
			parr[i] = p;			//배열 = 변수
			parr[i].no = i + "1234";//PhoneEx1 변수.인스턴스변수=i+문자
		}
		for (int i = 0; i < parr.length; i++) {//i가 0부터 3보다 작을때까지
			//클래스.변수.메소드(parr[0].no01234)
			System.out.printf("parr[%d].no%s\n",i,parr[i].no);
			//21234로 전화 송신 중~
			//parr[0].send 안에 ((0==0)참이면 앞에 문장 실행
			//참이면 배열.길이-1을 출력 : 거짓이면 배열-1
			parr[i].send((i==0)?parr[parr.length -1].no : parr[i-1].no);
		}
	}
}
