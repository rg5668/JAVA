package ch14;

import java.util.HashSet;
import java.util.Set;
/*
 * Set ÀÎÅÍÆäÀÌ½º : Áßº¹ °´Ã¼¸¦ ÀúÀåÇÏÁö ¾Ê´Â´Ù.
 * 		±¸Çö Å¬·¡½º : HashSet, LinkedHashSet, TreeSetÀÌ ÀÖ´Ù.
 */
public class SetEx1 {
	public static void main(String[] args) {
		Object[] arr = {"È«±æµ¿",1,"1","±è»ñ°«","ÀÌ¸ù·æ",
				"È«±æµ¿","¼ºÃáÇâ","Çâ´ÜÀÌ","È«±æµ¿","±è»ñ°«","ÀÌ¸ù·æ"};
		Set<Object> set1 = new HashSet<Object>();//¸ÕÀú ÁÖ¼Ò¿¡ arr°ªÀ» ³Ö´Â´Ù.
		Set<Object> set2 = new HashSet<Object>();
		Set<Object> set3 = new HashSet<Object>();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("set1:ÃÊ±â=" + set1);
			if (!set1.add(arr[i])) {	//add°¡ µÇ¸é true ¾ÈµÇ¸é false·Î if¹® ÁøÇà
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
