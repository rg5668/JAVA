package ch14;

import java.util.HashSet;
import java.util.Set;
/*
 * Set �������̽� : �ߺ� ��ü�� �������� �ʴ´�.
 * 		���� Ŭ���� : HashSet, LinkedHashSet, TreeSet�� �ִ�.
 */
public class SetEx1 {
	public static void main(String[] args) {
		Object[] arr = {"ȫ�浿",1,"1","���","�̸���",
				"ȫ�浿","������","�����","ȫ�浿","���","�̸���"};
		Set<Object> set1 = new HashSet<Object>();//���� �ּҿ� arr���� �ִ´�.
		Set<Object> set2 = new HashSet<Object>();
		Set<Object> set3 = new HashSet<Object>();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("set1:�ʱ�=" + set1);
			if (!set1.add(arr[i])) {	//add�� �Ǹ� true �ȵǸ� false�� if�� ����
//				System.out.println("set1:" + set1);
//				System.out.println("==============");
				if (!set2.add(arr[i])) {
//					System.out.println("set2:" +set2);
//					System.out.println("==============");
					set3.add(arr[i]);
//					System.out.println("set3:" +set3);
				}
			}
		}
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		}
	}
