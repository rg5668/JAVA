package ch05;

public class Exam16 {
	public static void main(String[] args) {
		int first = 1;
		int second = 1;
		int element = 1;
		System.out.print(first + ",");
		
		while(element<1000) {
			System.out.print(second+",");
			element = first+second;
			second = element;
		}
		System.out.println();
	}
}
