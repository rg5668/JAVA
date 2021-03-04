package ch17;

import java.io.File;

/*
 * File Ŭ���� ����
 * 	- �����̳� ������ ������ �����ϴ� Ŭ����.
 * 	- file�� ��� ��ü�� �������.
 */
public class FileEx1 {
	public static void main(String[] args) {
		String filePath = "c:\\";
		File f1 = new File(filePath); //c:\ ����
		String files[] = f1.list();
		
		for(String f : files) {
			File f2 = new File(filePath, f);
			if (f2.isDirectory()) {//����?
				System.out.printf("%s : ���丮%n", f);
			} else if(f2.isFile()) {//����?
				System.out.printf("%s : ����(%d byte)%n",f,f.length());
			}
		}
	}
}
