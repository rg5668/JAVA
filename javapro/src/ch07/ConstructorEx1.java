package ch07;


class Number1 {
	int num;
	//디폴트 생성자가 자동으로 생성
}

class Number2 {
	int num;
	
	Number2() {	//디폴트 생성자 
		
	}
	Number2(int x) {	//생성자
		num = x;
	}
}
public class ConstructorEx1 {
	public static void main(String[] args) {
		Number1 n1 = new Number1();
		n1.num = 10;
		Number2 n2 = new Number2();
		Number2 n3 = new Number2(20);
		System.out.println("Number1 클래스의 num=" + n1.num);
		System.out.println("Number2 클래스의 num=" + n2.num);
		System.out.println("Number2 (타입) 클래스의 num=" + n3.num);
	}
}
