package ch06;
/*
 * 1����9���� ���� �� �ߺ����� �ʴ� 3�ڸ� ���ڸ� ���Ƿ� �����ϴ� ���α׷� �ۼ��ϱ�
 */
public class Exam_3 {
	public static void main(String[] args) {
		int arr [] = new int [9];
		int nums [] = new int [3];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		for (int i = 0; i < 1000; i++) {
			int t = (int)(Math.random()*9);
			int f = (int)(Math.random()*3);
			int temp = 0;
			temp = arr[t];
			arr[t] = arr[f];
			arr[f] = temp;
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = arr[i];
		}
		for(int a : nums) {
			System.out.print(a + " ");
		}
	}
}
