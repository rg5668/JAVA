package ch11;

public class EqualsEx3 {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");//��Ʈ���� ������Ʈ�� �������̵� �Ѱ�
		
		if (s1 == s2) {
			System.out.println("s1���ڿ� ��ü�� s2���ڿ� ��ü�� ���� ��ü��");
		}else {
			System.out.println("s1���ڿ� ��ü�� s2���ڿ� ��ü�� �ٸ� ��ü��");
		}
		if (s1.equals(s2)) {
			System.out.println("s1���ڿ� ��ü�� s2���ڿ��� ���� ���ڿ���");
		}else {
			System.out.println("s1���ڿ� ��ü�� s2���ڿ��� �ٸ� ���ڿ���");
		}
	}
}
