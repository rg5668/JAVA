package ch07;

class Car2 {
	String color;
	int number;
	
	Car2(String color, int number) {
		System.out.println("(String,int) 생성자 호출");
		this.color = color;
		this.number = number;
	}
	Car2() {
		this("white", 1234);
		System.out.println("() 생성자 호출");
	}
	Car2(String color) {
		this(color,1234);
	}
	Car2(int number) {
		this("white", number);
	}
	Car2(Car2 c) {
		this(c.color, c.number);
	}
	@Override
	public String toString() {
		return color + "," + number;
	}
}
public class ThisEx1 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue",0101);
//		Car2 c3 = new Car2("red");
//		Car2 c4 = new Car2(5678);
		Car2 c5 = new Car2(c1);
		
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
//		System.out.println("c3:"+c3);
//		System.out.println("c4:"+c4);
		System.out.println("c5:"+c5);
		
//		System.out.println(c1);
	}
}
