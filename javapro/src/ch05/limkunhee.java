package ch05;

public class limkunhee {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.print("(");
			
			for (int j = 1; j <= i; j++) {
				sum += j;
				System.out.print(j+((i!=j)?"+" : ""));//!=두연산자가 다른지
			}
			System.out.print(")"+((i==10)?"=":"+"));
		}
		System.out.println(sum);
	}
}
