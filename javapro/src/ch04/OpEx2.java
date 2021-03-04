package ch04;

public class OpEx2 {
	public static void main(String[] args) {
		int x=5, y=0;
		y = x ++;
		System.out.println("x="+x+",y="+y);//6,5
		y = ++ x;
		System.out.println("x="+x+",y="+y);//7,7
		System.out.println("x=" + x++);//7
		System.out.println("x=" + ++x);//9
		x= y--;
		System.out.println("x="+x+",y="+y);//7,6
		x= --y;
		System.out.println("x="+x+",y="+y);//5,5
	}
}
