package ch06;

public class Exam3 {
	public static void main(String[] args) {
		int [] arr = new int[9];
		int [] nums = new int[3];
		
		for (int i = 0; i < arr.length; i++) {	// i�� 0���� 8���� �ݺ�
			arr[i]=i+1;							// arr[i]�� +1���ؼ� 1~9���� ����
		}
		
		for (int i = 0; i < 10000; i++) {		// i�� 0���� 9999���� �ݺ�
			int f = (int)(Math.random() * 9);	// Math.random�� �տ� ����� ����ȯ�� ���ְ� 0.0~1.0 * 9�� 0~9���� ����
			int t = (int)(Math.random() * 3);	// 3���� ���� ���� �ִ� ����
			int tmp = arr[f];					// �˰��� ���� arrays.sort�� �����ϰ� ���İ���
			arr[f] = arr[t];
			arr[t] = tmp;
		}
		for (int i=0; i<nums.length; i++) {		//i�� 0���� 2���� �ݺ�
			nums[i] = arr[i];					//arr[t�� ����Ǿ��ִ�] i�� num[i]�� �ְ�
		}
		for (int n : nums)						//�� ��ġ�� int n : nums[3]�� �ִ� ���� ���
			System.out.print(n + ",");
	}
}
