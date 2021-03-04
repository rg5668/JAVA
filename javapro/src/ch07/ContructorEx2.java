package ch07;


class Car {
	String color; 
	int number;
	
	Car(String c, int n) {
		color = c;
		number = n;
	}
	Car(String c) {
		color = c;
		number = 1;
	}
	Car(int n) {
		color = "white";
		number = n;
	}
	Car(Car c) {
		color = c.color;
		number = c.number;
	}
	public String toString() {
		return color + "," + number;
	}
}
public class ContructorEx2 {
	public static void main(String[] args) {
		//Car c = new Car(); //생성할때 디폴트 생성자가 없기때문에 불가
		Car c1 = new Car("bule",1234);
		//c1.color = "red";	//변수명.인스턴스변수로도 사용가능
		Car c2 = new Car("red");
		Car c3 = new Car(1234);
		Car c4 = new Car(c3);
		System.out.println("c1:" +c1);
		System.out.println("c2:" +c2);
		System.out.println("c3:" +c3);
		System.out.println("c4:" +c4);
	}
}
