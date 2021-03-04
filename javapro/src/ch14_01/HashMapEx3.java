package ch14_01;

import java.util.*;

class HashMapEx3 {
	static HashMap<String, HashMap<String, String>> phoneBook =
			new HashMap();
	
	public static void main(String[] args) {
		addPhoneNo("친구", "이자바", "010-111-1111");
		addPhoneNo("친구", "이자바", "010-222-2222");
		addPhoneNo("친구", "이자바", "010-333-3333");
		addPhoneNo("회사", "이자바", "010-444-4444");
		addPhoneNo("회사", "이자바", "010-555-5555");
		addPhoneNo("회사", "이자바", "010-666-6666");
		addPhoneNo("회사", "이자바", "010-777-7777");
		addPhoneNo("세탁", "010-888-8888");
//		System.out.println(phoneBook);
		printList();
	}
	//그룹에 전화번호를 추가하는 메서드
	//addGroup메서드에 가서 groupName이 있는지 확인
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap<String, String> group = phoneBook.get(groupName);
		group.put(tel, name);	//이름은 중복될 수 있으니 전화번호를 key로 저장
	}
	
	static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타", name, tel);
	}
	
	//그룹을 추가하는 메서드<String, HashMap>
	static void addGroup(String groupName) {
		if (!phoneBook.containsKey(groupName)) {//아직 추가 전 phoneBook에 친구가 있는지 없는지
			phoneBook.put(groupName, new HashMap<String, String>());//없으면 친구, 해쉬맵 addPhoneNo 다시 리턴
		}
	}
	
	static void printList() {
//		Set<Map.Entry<String, HashMap<String, String>>> set =
//				phoneBook.entrySet();
		Iterator<Map.Entry<String, HashMap<String,String>>> itp =
				phoneBook.entrySet().iterator();//변수로 잡아도 되고 아니여도됨.//하나씩 데이터 읽는다는것
		while(itp.hasNext()) {
			//System.out.println(itp.next());//toString이 찍혀져서 나온거
			Map.Entry<String, HashMap<String, String>> e = itp.next();
			System.out.println(" * " + e.getKey() + "["+e.getValue().size()+"]");
//			System.out.println(e.getValue());
			
			//결과 출력이 한줄한줄 나오게 하는거
			Iterator<Map.Entry<String, String>> subit =
					e.getValue().entrySet().iterator();
			while(subit.hasNext()) {
				Map.Entry<String, String> se = subit.next();
				System.out.println(se.getValue()+"="+se.getKey());
			}
		}
	}
}//class
