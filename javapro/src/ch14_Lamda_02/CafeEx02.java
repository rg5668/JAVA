package ch14_Lamda_02;

interface LamdaEx02 {
	int method(int x, int y);
}
public class CafeEx02 {
	static int[] arr = {1,2,3,4,5,6,7,8,9,10};
	
	public static void main(String[] args) {
		System.out.println("5,2 두 수의 합:" +
				sum((a,b) -> (a+b), 5, 2));
		
		System.out.println("5,2 두 수의 곱:" +
				sum((a,b) -> (a*b), 5, 2));
		
		System.out.println("arr 배열 중 가장 큰수:" +
				maxAndMin((a,b) -> (a>=b)?a:b));
		
		System.out.println("arr 배열 중 가장 작은수:" +
				maxAndMin((a,b) -> (a<=b)?a:b));
		
		//익명 클래스
		LamdaEx02 f = new LamdaEx02() {

			@Override
			public int method(int a, int b) {
				return (a<=b) ? a : b;
			}
			
		};
		System.out.println("arr 배열 중 가장 작은 수:" + maxAndMin(f));
	}
	
	static int sum(LamdaEx02 f, int x, int y) {
		return f.method(x, y);
	}
	
	static int maxAndMin(LamdaEx02 f) {
		int result = arr[0];
		for(int i : arr) {
			result = f.method(result, i);
		}
		return result;
	}
}
