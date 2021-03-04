package ch12_01;

import java.util.Calendar;

public class CalendarEx6 {
	public static void main(String[] args) {
		int year = 2021;
		int month = 1;
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		Calendar sDay = Calendar.getInstance();//������
		Calendar eDay = Calendar.getInstance();//����
		//���� ��� 0���� 11������ ���� �����Ƿ� 1�� ���־�� �Ѵ�.
		//���� ���, 2004�� 11�� 1���� sDay.set(2004, 10, 1);�� ���� ������Ѵ�.
		sDay.set(year, month-1, 1);
		eDay.set(year, month, 1);
		//�������� ù������ �Ϸ縦 ���� ������� ������ ���� �ȴ�.
		//12�� 1�Ͽ��� �Ϸ縦 ���� 11�� 30���� �ȴ�.
		eDay.add(Calendar.DATE, -1);
		
		//ù ��° ������ ���� �������� �˾Ƴ���.
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		System.out.println(START_DAY_OF_WEEK);
		//eDay�� ������ ��¥�� ���´�.
		END_DAY = eDay.get(Calendar.DATE); //31
		
		System.out.println("      "+year+"�� "+month+"��");
		System.out.println(" SU MO TU WE TH FR SA");
		
		//�ش� ���� 1���� ��� ���������� ���� ������ ����Ѵ�.
		//���� 1���� �������̶�� ������ �� �� ��´�.(�Ͽ��Ϻ��� ����)
		
		for (int i = 1; i < START_DAY_OF_WEEK; i++) {
			System.out.print("   ");
		}
		//n�� ������ �ٲٴ� ����, i�� ��¥
		for (int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
			System.out.print((i < 10)? "  "+i : " "+i );
			if (n%7==0) 
				System.out.println();
		}
	}
}