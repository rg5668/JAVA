package ch14_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
/*
 * Properties Ŭ���� HashTable ���̺��� ���� Ŭ������.
 * HashTable�� Map �������̽��� ���� Ŭ�����̹Ƿ� Properties
 * Ŭ������ Map�� ������ Ŭ������.
 * (key, value) �ڷ����� ��� String��. ���׸�ǥ���� ���Ѵ�.
 * -�ؽ�Ʈ���Ͽ� Properties ��ü�� �߰��� �� �ִ� ����� �ִ�.
 */
public class PropertiesEx1 {
	public static void main(String[] args) throws IOException {
		Properties pr = new Properties();
		System.out.println(pr);
		//m.properties ������ ����. ���� �غ� �Ϸ�
		FileInputStream fis =
				new FileInputStream("src/ch14_01/m.properties");
		pr.load(fis);//load�б�
		System.out.println(pr);
		//pr.get("name") : Ű�� name�� ��ü�� Value�� ����. : ȫ�浿
		System.out.println("�̸�:" + pr.get("name"));
//		pr.getProperty : HashTable ������ ���Ǵ� get�޼���
		System.out.println("��ȭ��ȣ:" + pr.getProperty("tel"));
		pr.put("subject", "��ǻ�Ͱ���");
		System.out.println(pr);
		//FileOutputStream : ���� �����ϱ�.
		FileOutputStream fos = 
				new FileOutputStream("src/ch14_01/m1.properties");
		//pr ��ü�� (key, value) ��ü�� ���Ϸ� ����
		pr.store(fos, "#save");//store����
	}
}
