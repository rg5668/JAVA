package ch12;
/*
 * StringBuffer�� ���ͷ� ������ �Ұ���
 * StringBuffer�� ���� ��� �����̵�.
 * �޼ҵ�(append) �� �߰��Ͽ�����
 * append�� ������ ������ �ٲ��� ����.
 */
public class StringBufferEx2 {
	public static void main(String[] args) {
//		StringBuffer sb = "01"; //���ͷ� ������ �Ұ�
		StringBuffer sb = new StringBuffer("01");	//100����
		
		StringBuffer sb2 = sb.append(23);
		sb2.append('4').append(56);
		
		StringBuffer sb3 = sb.append(78);
		sb3.append(9.0);
		
		System.out.println("sb ="+sb);
		System.out.println("sb2 ="+sb2);
		System.out.println("sb3 ="+sb3);
		System.out.println("sb.deleteCharAt" + sb.deleteCharAt(10));//10��°����������
		System.out.println("sb.delete =" + sb.delete(3, 6));	//3�̻󿡼� 6����(5)����
		System.out.println("sb.insert =" + sb.insert(3, "abc"));//3�̻󿡼� ���ڿ��� �ٲ�
		System.out.println("sb.replace ="
		+ sb.replace(6, sb.length(), "END"));	//6�̻󿡼��� END�� ���
		System.out.println("sb.capacity =" + sb.capacity());//������ �ι� �޸�
		System.out.println("sb.length" + sb.length());//����
		
		sb.delete(0,sb.length());
		System.out.println("�ʱ�ȭ�� sb =" + sb);
	}
}
