package ch07;
//자바의 4가지, 인스턴스, 메서드4가지 기억하기 

//클래스
class Phone{//클래스
	String color;	// 클래스명 멤버변수(타입을 썻을때 클래스) 
	boolean power;	//변수명 인스턴스변수(별로의 다른 값을 가짐)
	String no;		//클래스명 변수
	
	void power() {		//멤버메서드를 호출하면 반대의 결과를 호출
		power =! power;		// 메인에서 void 호출하려면 변수명.멤버메서드()
	}
	void send(String no) {//매서드(스트링은클레스 변수명)
		//클래스.변수.메소드 
		System.out.println(no + "로 전화 송신 중~");
	}
	void recive(String no) {//접근제어자 리턴타입 메소드명(클래스 매개변수)
		System.out.println(no + "전화 수신 중~");
	}
}

public class PhoneEx1 {
	public static void main(String[] args) {
		//*기억하기 변수, 클래스, 메서드, 생성자*
		//타입을 썻을때 클래스.변수명 = new 클래스생성자() ->해당되는 클래스를 주소를 리턴
		Phone p1 = new Phone();	
		p1.color = "검정";	//변수.변수=리터럴
		p1.power = true;
		p1.no = "01012345678";	//변수.변수=파라메타
		
		System.out.println(p1.color + "," + p1.power + "," + p1.no);
		
		//변수.메서드(파라미터)
		p1.send("01011111111");
		p1.recive("01011111111");
		
		////타입을 썻을때 클래스.변수명 = new 클래스생성자() ->해당되는 클래스를 주소를 리턴
		Phone p2 = new Phone();	//같은 타입은 가져도 각 인스턴스의 변수는 서로 다른 값을 유지할수있다.
		//클래스.변수.메소드		변수.변수
		System.out.println(p2.color + "," + p2.power + "," + p2.no);
		p2.send(null);
		p2.recive(null);
		//변수 = 변수 (가르키는주소 타입 인스턴스가 같기 때문에 가능)
		p2 = p1;
		
		System.out.println(p2.color + "," + p2.power + "," + p2.no);
		p2.send("01022222222");
		p2.recive("01022222222");
	}
}
