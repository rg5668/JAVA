package ch14_Lamda_02;

interface LambdaEx02 {
	int method(int x, int y);
}

public class Exam2 {
	static int[] arr = {1,2,3,4,5,6,7,8,9,10};
	public static void main(String[] args) {
		System.out.println("(5,2)�� ���� ��:"
				+ sum((a,b)-> (a+b), 5,2));
		System.out.println("(5,2)�� ���� ��:"
				+ sum((a,b)-> (a*b), 5,2));
		System.out.println("arr �迭 �� ���� ū��:"
				+maxAndMin((a,b) -> (a>=b?a:b)));
		System.out.println("arr �迭 �� ���� ������:"
				+maxAndMin((a,b) -> (a>=b?a:b)));
		LambdaEx02 f = new LambdaEx02() {

			@Override
			public int method(int x, int y) {
				return ((x >= y) ? x : y);
			}
		};
				System.out.println("arr �迭 �� ���� ū��:" + maxAndMin(f));
	}
	
	static int sum (LambdaEx02 f, int x, int y) {
		return f.method(x, y);
	}
	
	static int maxAndMin(LambdaEx02 f) {
		int result = arr[0];
		for(int i : arr) {
			result = f.method(result, i);
		}
		return result;
	}
}
