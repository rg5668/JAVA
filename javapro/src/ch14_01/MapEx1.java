package ch14_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//Map이라는 클래스가 toString 오버라이딩이 되어있다.
public class MapEx1 {
	public static void main(String[] args) {
		//key,value
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] names = {"홍길동", "김삿갓", "이몽룡", "임꺽정", "김삿갓"};
		int[] nums = {1234, 4567, 2350, 9870, 2345};
		//중복되면 걸러내고 마지막에 저장되는게 값(key는 중복값을 여러개 저장하지 않는다.)
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]);
		}
		//저장된 key,value 출력
		System.out.println(map);
		//key값으로 Value값 출력
		System.out.println("홍길동 번호:" + map.get("홍길동"));
		System.out.println("이몽룡 번호:" + map.get("이몽룡"));
		System.out.println("김삿갓 번호:" + map.get("김삿갓"));
//		System.out.println("이모룡 번호:" + map.get(2345));//Value값으로는 key를 못찾음
		
		//Map에서 key만 조회하기
		Set<String> keys = map.keySet(); //KeySet으로 key만 조회가능
		for(String key : keys) {
			System.out.println(key + "=" + map.get(key));
		}
		System.out.println("Iterator 이용하여 key:value 출력");
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String a = it.next();
			System.out.println(a + "=" + map.get(a));
		}
		
		System.out.println("Iterator 이용하여 value 출력");
		//Map 객체에서 Collection 메서드로 value들만 조회하기
		Collection<Integer> values = map.values();
		for (Integer i : values) {
			System.out.println(i);
		}
		System.out.println("========================");
		
		Iterator<Integer> itvalue = values.iterator();//다음값 있는지
		while(itvalue.hasNext()) {//iterator랑 hasNext랑 같이 써야함.
			System.out.println(itvalue.next());
		}
		
		//Key, Value의 쌍인 객체(Entry)로 조회 (셋이랑 거이 같음)
		
		System.out.println("Key,Value의 쌍인 객체로 조회");
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for (Map.Entry<String, Integer> m : entry) {
			System.out.println(m.getKey() + "의 번호:" + m.getValue());
			System.out.println(m);//Map에 toString이 있음 결과 Key=Values
		}
		// 이렇게도 사용가능 엔트리 두개 이터레이터
		System.out.println("========================");
		Iterator<Entry<String, Integer>> itm = entry.iterator();
		while(itm.hasNext()) {
			Map.Entry<String, Integer> itm2 = itm.next();
			System.out.println(itm2.getKey()+"의 번호"+itm2.getValue());
//			System.out.println(itm.next());
		}
	}
}
