package ch12_01;
/*
 * count �޼��� �����ϱ�.
 * int count("���ڿ��ҽ�","ã�� ���ڿ�") : ���ڿ� �ҽ����� ã�� ���ڿ��� ������ ����
 */
public class Exam1 {
	//a="12345", b="6"
	static int count(String a, String b) {
		int idx = 0, cnt = 0;
		//idx�� 0�� ������ ã�ƶ�
		//cnt�� ī��Ʈ ����
		while(true) {
			idx = a.indexOf(b, idx); //0 //�ԷµǴ� ���� ��� ������
			System.out.println(idx);
			if (idx == -1)
				break;
			idx++;
			cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB","12"));//2
		System.out.println(count("12345AB12AB345AB","AB"));//3
		System.out.println(count("12345","6")); //0
	}
}
