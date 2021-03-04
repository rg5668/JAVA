package ch06;

public class ArrayEx1 {
	public static void main(String[] args) {
		int [] arr1;
		int arr2[];
		arr1 = new int [5];
		arr2 = new int [5];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
//		arr2 = arr1;
		arr2[4] = 50;
		
		System.out.println("arr1 배열:");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "=]" + arr1[i] );
		}
		System.out.println("arr2 배열:");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr1[" + i + "=]" + arr2[i] );
		}
		System.out.println("개선된 for 구문을 이용한 출력");
		for(int a : arr1) {System.out.println(a);}
		System.out.println("개선된 for 구문을 이용한 출력 2");
		for(int a : arr2) {System.out.println(a);}
	}
}
