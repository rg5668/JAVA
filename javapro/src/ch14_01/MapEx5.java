package ch14_01;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapEx5 {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		map.put("spring", "12");	map.put("summer", "123");
		map.put("fall", "1234");	map.put("winter", "12345");
		map.put("summer", "1111");
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
			System.out.print("���̵�: ");
			String id = scan.nextLine();
			System.out.print("��й�ȣ: ");
			String password = scan.nextLine();
			//map�� key���� �ִ���(id) �ִ��� Ȯ��
			if (map.containsKey(id)) {
				//map�� ���� �Ǿ� �ִ� password
				if (map.get(id).equals(password)) {//equals�ΰ��� �� ��
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			} else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}
		}
	}
}
