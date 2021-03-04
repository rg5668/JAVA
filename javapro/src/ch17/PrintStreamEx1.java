package ch17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
/*
 * ���� ��Ʈ�� ���� : PrintStream
 * 	-OutputStream�� ���� Ŭ����
 * 	-print(), println(), printf() �޼��� �߰�
 * 	-��� �ڷ����� ���.
 * 	-System.out(ǥ�� ��°�ü),System.err(ǥ�� ������ü)�� �ڷ�����.
 */
public class PrintStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps = new PrintStream(fos, true);
		//true : auto flush ����߰�
		ps.println("ȫ�浿11");
		ps.println(1234);
		ps.println(true);
		ps.println(65);//String���� ����
		ps.write(65);//char�� ����
//		ps.flush();
		
		ps = new PrintStream("print2.txt");
		ps.println("ȫ�浿22");
		ps.println(1234666);
		ps.println(true);
		ps.println(6522);
		ps.write(66);
		ps.flush();
	}
}
