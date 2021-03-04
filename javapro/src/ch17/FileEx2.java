package ch17;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
 * File Ŭ������ �ֿ� �޼���
 * boolean f1.mkdir() : ���� ����.
 * boolean f2.createNewFile() : ���� ����.
 * boolean f2.renameTo(f3) : f2 ������ f3�� ����
 * long f3.lastModified() : 1970�� ���� �и��ʸ� ����.
 * boolean f3.deletr() : ���ϻ���.
 */
public class FileEx2 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("c:/temp1");//temp1 ���� ����. ���� ���� ����
		System.out.printf("%s ���� ����: %b\n", 
				f1.getAbsoluteFile(), f1.mkdir());
		
		File f2 = new File("c:/temp1/test.txt");//�������� �ʴ� ����.
		System.out.printf("%s ���� ���� : %b\n",
				f2.getAbsolutePath(),f2.createNewFile());
		System.out.printf("���� �̸�:%s, ����ũ��:%,d byte\n",
				f2.getName(),f2.length());
		
		File f3 = new File("c:/temp1/test2.txt");//�������� �ʴ� ����
		System.out.printf("%s->%s �̸� ����:%b\n",
				f2.getName(), f3.getName(), f2.renameTo(f3));
		
		System.out.printf("%s ���� ���� ���� �ð� : %s\n",
				f3.getName(),new Date(f3.lastModified()));
		
//		System.out.printf("%s ���� ����:%b\n",
//				f3.getName(),f3.delete());
		
	}
}