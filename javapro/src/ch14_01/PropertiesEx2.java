package ch14_01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx2 {
	public static void main(String[] args) {
		//둘다 스트링
		Properties prop = new Properties();
		
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "한글");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		try {
			prop.store(new FileOutputStream("src/ch14_01/output.txt"),
					"Properties Example");//저장
			prop.storeToXML(new FileOutputStream("src/ch14_01/output.xml"),
					"Properties Example");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
