package ch12_01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//�ΰ��� ��¥�� �Է¹޾Ƽ� �γ�¥������ �ϼ��� ����ϱ�
public class CalendarEx3 {
	public static void main(String[] args) throws ParseException{
		System.out.println("ù��° ��¥�� �Է��ϼ���(yyyy-MM-dd)");
		Scanner scan = new Scanner(System.in);
		String first = scan.nextLine();
		
		System.out.println("�ι�° ��¥�� �Է��ϼ���(yyyy-MM-dd)");
		String second = scan.nextLine();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date fdate = sf.parse(first);
		Date sdate = sf.parse(second);
		
		long datecnt = (sdate.getTime()
				- fdate.getTime())/(1000*60*60*24);
		System.out.printf("%s - %s ������ ���� : %d\n",second,first,datecnt);
	}
}
