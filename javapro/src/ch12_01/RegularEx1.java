package ch12_01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//����ǥ����
public class RegularEx1 {
	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bonus",
				"cA","ca","co","c.","c0","caaCC",
				"car","combat","count","date","disc"};
		//c�� �����ϴ� �ҹ��ڿ��� ��� ���
		//compile �־��� ����ǥ�������κ��� ������ ����ϴ�.
		Pattern p = Pattern.compile("c[a-z]*"); //����
		
		for (int i = 0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]);	//��ġ
			if (m.matches()) { 
//matches��� ���ڿ��� ������ ��ġ�� ��� true ��ȯ�մϴ�
				System.out.print(data[i] + ", ");
			}
		}
		}
	}
