package ch08;

public class Exam2 {
	public static void main(String[] args) {
		Rectangle[] rarr = new Rectangle[3];
		for (int i = 0; i < rarr.length; i++) {
			rarr[i] = new Rectangle();
			rarr[i].width = 10 + i;
			rarr[i].height = 20 + i;
			System.out.println(i + "번 사격형 넓이:");
			rarr[i].area();
			System.out.println(i + "번 사각형 둘레:");
			rarr[i].length();
		}
	}
}
