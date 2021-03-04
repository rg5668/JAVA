package ch14_02;

import java.util.Set;
import java.util.TreeSet;
/*
 * TreeSet ���� : �ߺ��Ұ�, ����
 * Lotto ��ȣ ������ TreeSet�� �̿��Ͽ� ����ϱ�
 * 0 ~ 45������ ������ 4���� ���� ���� �����Ͽ� ����Ʈ�Ѵ�.
 * ex) 3,12,34,36
 */
public class Exam3 {
	public static void main(String[] args) {
		System.out.println("Lotto ��ȣ ======");
		Set<Integer> ball = new TreeSet<Integer>();

		while(ball.size() < 4) {
			ball.add((int)(Math.random()*45)+1);
		}
		System.out.println(ball);
	}
}
