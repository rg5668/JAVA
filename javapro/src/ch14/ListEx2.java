package ch14;

import java.util.List;
import java.util.Vector;

/*
 * Vector ���� : Collection �����ӿ�ũ ������ ���Ǵ� Ŭ����.
 * 				List�� ���� Ŭ����
 */
public class ListEx2 {
	public static void main(String[] args) {
		List<Double> list = new Vector<Double>();
		list.add(0.3);
		list.add(Math.PI);
//		list.addElement(5.0); Vector���� �ִ� �޼���. add�� ���� ���
		list.add(5.0);
		
		for(Object o : list) {
			System.out.println(o);
		}
		System.out.println("1:"+list);
		
		double num = 5.0;
		int index = list.indexOf(num);
		//������ -1 ���
		if(index >= 0) {
			System.out.println(num + "�� ��ġ:" + index);
		} else {
			System.out.println(num + "�� list�� �����ϴ�.");
		}
		
		num = 0.3;
		System.out.println(list.indexOf(num));//0
		System.out.println(list.indexOf(5.0));//2
		
		if(list.contains(num)) {//list�� ��� �� 0.3�� ������ ����?//���ڿ��� Ư�� ���ڿ��� ���ԵǾ� �ִ��� Ȯ���ϴ� �Լ�
//			list.removeElement(num);	//����
			list.remove(num);//����
			System.out.println(num + "������");
		}
		
		System.out.println("2:"+list);
		System.out.println(list.indexOf(num)); //-1(0.3�� ��� -1)
		System.out.println(list.indexOf(5.0)); //1
		System.out.println(list);
	}
}
