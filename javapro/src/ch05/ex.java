package ch05;

public class ex {
	public static void main(String[] args) {
		double x = 5.0;
		double y = 1.0;
		double z = x%y;
		if ((double)y == 0.0) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		}else {
			double result = z + 10;
			System.out.println("결과: " + result);
		}
	}
}
