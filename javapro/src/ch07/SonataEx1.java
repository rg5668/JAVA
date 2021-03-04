package ch07;

class Sonata{	//클래스명
	String color;	//클래스 인스턴스 변수
	int number;		//인스턴스변수
	static int width=250;	//스테틱 클래스 변수
	static int height=150;
	public String toString() {
		return color + ":" + number + "(" + width + "," + height + ")";
	}
}
public class SonataEx1 {
	public static void main(String[] args) {
		System.out.println("자동차 크기:" + Sonata.width + "," + Sonata.height);
		Sonata car1 = new Sonata();	//클래스명 변수 = 생성자
		car1.color = "white";	car1.number = 1234;
		System.out.println("car1:" + car1);
		Sonata car2 = new Sonata();
		car2.color = "black";	car2.number =2345;
		car2.width = 300;
		car1.height = 200;
		String temp = "aaa:"+car1;
		System.out.println(temp);
		System.out.println("======================");
		System.out.println("car1:"+car1);
		System.out.println("car2:"+car2);
		println(car1);	//메소드명
	}
	public static void println(Object o) {
		System.out.println(o.toString());
	}
}
