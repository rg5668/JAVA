package ch14_01;

import java.util.*;

class HashMapEx3 {
	static HashMap<String, HashMap<String, String>> phoneBook =
			new HashMap();
	
	public static void main(String[] args) {
		addPhoneNo("ģ��", "���ڹ�", "010-111-1111");
		addPhoneNo("ģ��", "���ڹ�", "010-222-2222");
		addPhoneNo("ģ��", "���ڹ�", "010-333-3333");
		addPhoneNo("ȸ��", "���ڹ�", "010-444-4444");
		addPhoneNo("ȸ��", "���ڹ�", "010-555-5555");
		addPhoneNo("ȸ��", "���ڹ�", "010-666-6666");
		addPhoneNo("ȸ��", "���ڹ�", "010-777-7777");
		addPhoneNo("��Ź", "010-888-8888");
//		System.out.println(phoneBook);
		printList();
	}
	//�׷쿡 ��ȭ��ȣ�� �߰��ϴ� �޼���
	//addGroup�޼��忡 ���� groupName�� �ִ��� Ȯ��
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap<String, String> group = phoneBook.get(groupName);
		group.put(tel, name);	//�̸��� �ߺ��� �� ������ ��ȭ��ȣ�� key�� ����
	}
	
	static void addPhoneNo(String name, String tel) {
		addPhoneNo("��Ÿ", name, tel);
	}
	
	//�׷��� �߰��ϴ� �޼���<String, HashMap>
	static void addGroup(String groupName) {
		if (!phoneBook.containsKey(groupName)) {//���� �߰� �� phoneBook�� ģ���� �ִ��� ������
			phoneBook.put(groupName, new HashMap<String, String>());//������ ģ��, �ؽ��� addPhoneNo �ٽ� ����
		}
	}
	
	static void printList() {
//		Set<Map.Entry<String, HashMap<String, String>>> set =
//				phoneBook.entrySet();
		Iterator<Map.Entry<String, HashMap<String,String>>> itp =
				phoneBook.entrySet().iterator();//������ ��Ƶ� �ǰ� �ƴϿ�����.//�ϳ��� ������ �д´ٴ°�
		while(itp.hasNext()) {
			//System.out.println(itp.next());//toString�� �������� ���°�
			Map.Entry<String, HashMap<String, String>> e = itp.next();
			System.out.println(" * " + e.getKey() + "["+e.getValue().size()+"]");
//			System.out.println(e.getValue());
			
			//��� ����� �������� ������ �ϴ°�
			Iterator<Map.Entry<String, String>> subit =
					e.getValue().entrySet().iterator();
			while(subit.hasNext()) {
				Map.Entry<String, String> se = subit.next();
				System.out.println(se.getValue()+"="+se.getKey());
			}
		}
	}
}//class
