package ch09_2;

public class ComplexerEx2 {
	public static void main(String[] args) {
		Complexer com = new Complexer();
		if(com instanceof Complexer)
			System.out.println("com ��ü�� complexer ��ü��");
		if(com instanceof Complexerable)
			System.out.println("com ��ü�� Complexerable ��ü��");
		if(com instanceof Printerable)
			System.out.println("com ��ü�� Printerable ��ü��");
		if(com instanceof Scannerable)
			System.out.println("com ��ü�� Scannerable ��ü��");
		if(com instanceof Faxable)
			System.out.println("com ��ü�� Faxable ��ü��");
		if(com instanceof Object)
			System.out.println("com ��ü�� Object ��ü��");
	}
}
