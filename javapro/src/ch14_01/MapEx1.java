package ch14_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//Map�̶�� Ŭ������ toString �������̵��� �Ǿ��ִ�.
public class MapEx1 {
	public static void main(String[] args) {
		//key,value
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] names = {"ȫ�浿", "���", "�̸���", "�Ӳ���", "���"};
		int[] nums = {1234, 4567, 2350, 9870, 2345};
		//�ߺ��Ǹ� �ɷ����� �������� ����Ǵ°� ��(key�� �ߺ����� ������ �������� �ʴ´�.)
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]);
		}
		//����� key,value ���
		System.out.println(map);
		//key������ Value�� ���
		System.out.println("ȫ�浿 ��ȣ:" + map.get("ȫ�浿"));
		System.out.println("�̸��� ��ȣ:" + map.get("�̸���"));
		System.out.println("��� ��ȣ:" + map.get("���"));
//		System.out.println("�̸�� ��ȣ:" + map.get(2345));//Value�����δ� key�� ��ã��
		
		//Map���� key�� ��ȸ�ϱ�
		Set<String> keys = map.keySet(); //KeySet���� key�� ��ȸ����
		for(String key : keys) {
			System.out.println(key + "=" + map.get(key));
		}
		System.out.println("Iterator �̿��Ͽ� key:value ���");
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String a = it.next();
			System.out.println(a + "=" + map.get(a));
		}
		
		System.out.println("Iterator �̿��Ͽ� value ���");
		//Map ��ü���� Collection �޼���� value�鸸 ��ȸ�ϱ�
		Collection<Integer> values = map.values();
		for (Integer i : values) {
			System.out.println(i);
		}
		System.out.println("========================");
		
		Iterator<Integer> itvalue = values.iterator();//������ �ִ���
		while(itvalue.hasNext()) {//iterator�� hasNext�� ���� �����.
			System.out.println(itvalue.next());
		}
		
		//Key, Value�� ���� ��ü(Entry)�� ��ȸ (���̶� ���� ����)
		
		System.out.println("Key,Value�� ���� ��ü�� ��ȸ");
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for (Map.Entry<String, Integer> m : entry) {
			System.out.println(m.getKey() + "�� ��ȣ:" + m.getValue());
			System.out.println(m);//Map�� toString�� ���� ��� Key=Values
		}
		// �̷��Ե� ��밡�� ��Ʈ�� �ΰ� ���ͷ�����
		System.out.println("========================");
		Iterator<Entry<String, Integer>> itm = entry.iterator();
		while(itm.hasNext()) {
			Map.Entry<String, Integer> itm2 = itm.next();
			System.out.println(itm2.getKey()+"�� ��ȣ"+itm2.getValue());
//			System.out.println(itm.next());
		}
	}
}
