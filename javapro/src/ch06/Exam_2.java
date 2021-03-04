package ch06;

public class Exam_2 {
	public static void main(String[] args) {
		int arr[] = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
		}
		
		for(int a : arr) {
			System.out.print(a + ":");
			for (int i = 0; i < a; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
