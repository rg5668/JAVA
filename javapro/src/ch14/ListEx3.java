package ch14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ڿ����� ������ �Է��ϼ���(����:0)");
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		
		while(true) {
			int num = scan.nextInt();
			if (num%2==1) {	//Ȧ��
				list.add(num);
				sum += num;
			} else if(num == 0) {
				break;
			}
		}
		System.out.println("�Էµ� Ȧ�� :" + list);
		
		for(Integer i : list) {
			System.out.println(i);
		}
		System.out.println("Ȧ���� �� :" + sum);
		//list���� �ִ밪�� ��ġ�� ã���ִ°�
		System.out.println("�ִ밪 :" + Collections.max(list)
				+ ",index:" + list.indexOf(Collections.max(list)));//indexOf �� ��ġ ã���ִ°�
		System.out.println("�ּҰ� :" + Collections.min(list)
		+ ",index:" + list.indexOf(Collections.min(list)));
	}
}
