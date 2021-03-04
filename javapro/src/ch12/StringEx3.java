package ch12;

public class StringEx3 {
	public static void main(String[] args) {
		String s = "HTML-CSS-JavaScript-Java-JSP-������";
		String[] subject = s.split("-");
		
		for (int i = 0; i < subject.length; i++) {
			System.out.println((i+1) + ":" + subject[i]);
		}
		
		s = "ȫ�浿,���,�̸���,������,�Ӳ���";
		String[] names = s.split(",");
		
		for(String n : names) {
			System.out.println(n);
		}
		System.out.println("��ü�̸� :" + names.length + "��");
		//���� <= ���ڿ�
		int i = Integer.parseInt("100");
		System.out.println(i + 1);//101
		double d = Double.parseDouble("100.5");
		System.out.println(d + 0.1);//100.6
		System.out.println(++d);//101.5
		//���ڿ��� Format ���·� ����ϱ�
		String sf = String.format("%.2f", d + 0.125);//101.63
		System.out.println(sf);
		sf = String.format("%10d", i);
		System.out.println(sf);
		sf = String.format("16���� : %x", i);
		System.out.println(sf);
		sf = String.format("8���� : %o", i);
		System.out.println(sf);
	}
}
