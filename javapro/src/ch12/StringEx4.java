package ch12;
/*
 * String ���� ���� �ּҰ� ������
 * str�� �ּҰ� ���� �Է¿� ���� �ٲ��
 * *�ּҰ� �����Ǵ°� ����ϱ�*
 */
public class StringEx4 {
	public static void main(String[] args) {
		String str = "ABC";	//100
		String str1 = "ABC";	//100
		if(str == str1)
			System.out.println("str==str1 �ּ� ����");
		System.out.println("main :" +str);
		change(str);	//�ּ� �������� ����
		System.out.println("�ּ� �������� ���� change ���� main :" + str);//100
		str = change(str);	//�ּ� �缳��
		System.out.println("�ּ� �缳�� change ���� main-�缳��" + str);
		
		str = "12345678";
		System.out.println(str.substring(3)); //�ּ� �������� ����
		System.out.println("str.substring(3) ���� :"+str);
		
		str = str.substring(3); //�ּ� �缳��
		System.out.println("str = str.substring(3)���� :"+str);
	}
	
	static String change(String str) {
		str += "456";	//200
		System.out.println("change() s :" + str);
		return str;
	}
}
