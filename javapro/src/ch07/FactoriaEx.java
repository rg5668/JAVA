package ch07;

public class FactoriaEx {
	public static void main(String[] args) {
		System.out.println("4! =" + factorial(4));
		
	}
	public static int factorial(int i) {
		System.out.println("i" + i);
		return (i==1)?1:i*factorial(i-1);
	}
}
/*
 * 스택구조 first in first out
1)main 
2)factorial(4)
3)4*factorial(3); --> 4*6 = 24	4*3*2*1
4)3*factorial(2); --> 3*2 = 6
5)2*factorial(1); --> 2*1 = 2
6)return 1
	*/	