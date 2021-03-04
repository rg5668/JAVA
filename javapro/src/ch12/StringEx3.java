package ch12;

public class StringEx3 {
	public static void main(String[] args) {
		String s = "HTML-CSS-JavaScript-Java-JSP-½ºÇÁ¸µ";
		String[] subject = s.split("-");
		
		for (int i = 0; i < subject.length; i++) {
			System.out.println((i+1) + ":" + subject[i]);
		}
		
		s = "È«±æµ¿,±è»ñ°«,ÀÌ¸ù·æ,¼ºÃáÇâ,ÀÓ²©Á¤";
		String[] names = s.split(",");
		
		for(String n : names) {
			System.out.println(n);
		}
		System.out.println("ÀüÃ¼ÀÌ¸§ :" + names.length + "¸í");
		//¼ýÀÚ <= ¹®ÀÚ¿­
		int i = Integer.parseInt("100");
		System.out.println(i + 1);//101
		double d = Double.parseDouble("100.5");
		System.out.println(d + 0.1);//100.6
		System.out.println(++d);//101.5
		//¹®ÀÚ¿­À» Format ÇüÅÂ·Î Ãâ·ÂÇÏ±â
		String sf = String.format("%.2f", d + 0.125);//101.63
		System.out.println(sf);
		sf = String.format("%10d", i);
		System.out.println(sf);
		sf = String.format("16Áø¼ö : %x", i);
		System.out.println(sf);
		sf = String.format("8Áø¼ö : %o", i);
		System.out.println(sf);
	}
}
