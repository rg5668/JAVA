package ch14_Lamda_02;

interface LambdaEx01 {
	void method(int num);
}
public class Exam1 {
	public static void main(String[] args) {
		LambdaEx01 f = x -> {
		int sum = 0;
		for (int i = 1; i <= x; i++) {
			sum += i;
		}
		System.out.println(sum);
		};	
		
		f.method(10);
		f.method(100);
	}
}
