package ch03;

public class ArithmeticOperatorTest {
	public static void main(String[] args) {
		System.out.println(10/3);//3
		System.out.println(10%3);//1
		
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte) (b1 + b2);	
		
		int i1 = 100;
		long l1 = 200;
		int i2 = (int) (i1+l1);
		
		System.out.println(10 / 3);	//3
		System.out.println(10 / 3.0);	//3.333333//double·Î
		System.out.println(b3);//30
		System.out.println(i2);//300
		
		
	}
}
