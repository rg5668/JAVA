package ch14_Lamda_02;

import java.util.function.IntBinaryOperator;
/*
 * Operator �Լ��� �������̽�
 * �Ű����� ���ϰ��� ��� �ִ� �߻� �޼ҵ� ����
 * �ַ� �Ű����� �����ϰ� �� ����� ������ ��쿡 ���
 * �Ű� ������ Ÿ�԰� ���� ���� �з�
 */
public class OperatorExample {
	private static int[] scores = {92, 95, 87};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		//�ִ� �� ���
		int max = maxOrMin((a, b) -> {
			if(a>=b) return a;
			else return b;
		});
		System.out.println("�ִ밪:" + max);
		
		//�ּ� �� ���
		int min = maxOrMin ((a,b) -> {
			if(a<=b) return a;
			else return b;
		});
		System.out.println("�ּҰ�:" + min);
	}
}
