package ch17;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class DataInputStreamEx1 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("sample.dat");
			DataInputStream dis = new DataInputStream(fis);
			
			System.out.println(dis.readInt());	//4byte
			System.out.println(dis.readFloat());//4byte
			System.out.println(dis.readBoolean());//1byte
			
			dis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		File f = new File("sample.dat");
		System.out.println("file size:"+f.length()+ " byte");
	}
}
