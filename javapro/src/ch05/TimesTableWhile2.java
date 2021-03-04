package ch05;

public class TimesTableWhile2 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 9) {
			System.out.print(i + "´Ü: ");
			int j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + (i*j) + "\t");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
