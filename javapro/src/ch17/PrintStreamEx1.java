package ch17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
/*
 * 보조 스트림 예제 : PrintStream
 * 	-OutputStream의 하위 클래스
 * 	-print(), println(), printf() 메서드 추가
 * 	-모든 자료형을 출력.
 * 	-System.out(표준 출력객체),System.err(표준 오류객체)의 자료형임.
 */
public class PrintStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps = new PrintStream(fos, true);
		//true : auto flush 기능추가
		ps.println("홍길동11");
		ps.println(1234);
		ps.println(true);
		ps.println(65);//String으로 변경
		ps.write(65);//char로 변경
//		ps.flush();
		
		ps = new PrintStream("print2.txt");
		ps.println("홍길동22");
		ps.println(1234666);
		ps.println(true);
		ps.println(6522);
		ps.write(66);
		ps.flush();
	}
}
