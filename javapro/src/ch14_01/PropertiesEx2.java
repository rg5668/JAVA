package ch14_01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx2 {
	public static void main(String[] args) {
		//�Ѵ� ��Ʈ��
		Properties prop = new Properties();
		
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "�ѱ�");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		try {
			prop.store(new FileOutputStream("src/ch14_01/output.txt"),
					"Properties Example");//����
			prop.storeToXML(new FileOutputStream("src/ch14_01/output.xml"),
					"Properties Example");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
