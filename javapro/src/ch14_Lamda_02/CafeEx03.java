package ch14_Lamda_02;

import java.util.Random;
import java.util.function.IntBinaryOperator;

public class CafeEx03 {
	private static int[] arr = new int[10];
	public static void main(String[] args) {
//		1)1~100������ ������ ���� ä�켼��
		for (int i = 0; i <= 9; i++) {
			arr[i] = (int)(Math.random()*100+1);	
		}
		for(int a : arr) {
			System.out.print(a+",");
		}
		System.out.println();
		System.out.println("�ִ밪:"+maxOrMin((a,b)->(a>=b)?a:b));
		System.out.println("�ּҰ�:"+maxOrMin((a,b)->(a<=b)?a:b));
	}
	private static int maxOrMin(IntBinaryOperator op) {
		int result = arr[0];
		for(int arrs : arr) {
			result = op.applyAsInt(result, arrs);
		}
		return result;
	}
}
