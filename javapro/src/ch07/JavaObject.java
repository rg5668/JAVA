package ch07;

//1. 모든 클래스는 Object를 가지고 있다
//2. 참조변수를 프린트 시에는 toString() 메소드를 프린트 한다

public class JavaObject {
	public static void main(String[] args) {
		
		Aaa a1 = new Aaa();
		Object o = new Object();
		System.out.println(o);
		System.out.println(a1);
	}
}

class Aaa{ // extend Object를 한거랑 똑같음(생략) 
	//(Object안에 toString이 있음)
	int num = 303030;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return num+"입니다";
	}
}