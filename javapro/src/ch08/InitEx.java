package ch08;

public class InitEx {
	static int cv;	//클래스 변수
	int iv;			//인스턴스 변수
	InitEx() {		//생성자
		System.out.println("5. 생성자 호출됨");
	}
	static {		//static 초기화 블럭
		cv = (int)(Math.random()*100);
		System.out.println("1. 클래스 초기화 블럭 cv="+cv);
		//iv = (int)(Math.random() * 100); //==error
	}
	{	//인스턴스 초기화 블럭
		iv = (int)(Math.random()*100);
		System.out.println("4. 인스턴스 초기화 블럭. 생성자보다 먼저 호출됨" + iv);
	}
	public static void name() {
		
	}
	public static void main(String[] args) {
		System.out.println("2. main 메서드 시작.");
		System.out.println("3. main init1 객체 생성");
		InitEx init1 = new InitEx();
		name();
		System.out.println("main init2 객체 생성");
		InitEx init2 = new InitEx();
	}
}
