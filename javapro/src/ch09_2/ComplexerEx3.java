package ch09_2;

public class ComplexerEx3 {
	public static void main(String[] args) {
		Complexer com = new Complexer();
		Complexerable ca = com;
		ca.print();
		ca.scan();
		ca.send("010-2345");
		ca.receive("010-2345");
		
		Printerable p = com;	//자식이 (지정된것만)부모꺼
		p.print();
//		p.scan();
//		p.send("010-1234");
//		p.receive("010-1234");
		
		Scannerable s = com;
//		s.print();
		s.scan();
//		s.send("010-1234");
//		s.receive("010-1234");
		
		Faxable f = com;
//		f.print();
//		f.scan();
		f.send("010-2345");
		f.receive("010-2345");
	}
}
