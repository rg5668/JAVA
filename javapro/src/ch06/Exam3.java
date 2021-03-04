package ch06;

public class Exam3 {
	public static void main(String[] args) {
		int [] arr = new int[9];
		int [] nums = new int[3];
		
		for (int i = 0; i < arr.length; i++) {	// i는 0부터 8까지 반복
			arr[i]=i+1;							// arr[i]에 +1씩해서 1~9까지 생성
		}
		
		for (int i = 0; i < 10000; i++) {		// i는 0부터 9999까지 반복
			int f = (int)(Math.random() * 9);	// Math.random은 앞에 명시적 형번환을 써주고 0.0~1.0 * 9로 0~9까지 랜덤
			int t = (int)(Math.random() * 3);	// 3개의 랜덤 값을 넣는 변수
			int tmp = arr[f];					// 알고리즘 섞기 arrays.sort로 간편하게 정렬가능
			arr[f] = arr[t];
			arr[t] = tmp;
		}
		for (int i=0; i<nums.length; i++) {		//i는 0부터 2까지 반복
			nums[i] = arr[i];					//arr[t에 저장되어있는] i를 num[i]에 넣고
		}
		for (int n : nums)						//포 이치로 int n : nums[3]에 있는 값을 출력
			System.out.print(n + ",");
	}
}
