package ch08;

class Bicycle{
	String name;
	double weight;
	int price;
	
	void move() {
		System.out.println("자전거를 타고 이동합니다.");
	}
	void horn() {
		System.out.println("따르르릉! 지나갈게요~");
	}
}
public class CafeEx01 {
	public static void main(String[] args) {
		Bicycle b1 = new Bicycle();
		b1.name = "로드형 자전거";
		b1.weight = 7.25;
		b1.price = 326000;
		
		System.out.printf("b1->{%s,%.2f,%d}\n", b1.name, b1.weight, b1.price);
		
		Bicycle b2 = new Bicycle();
		b2.name = "스피드 자전거";
		b2.weight = 9.25;
		b2.price = 445000;
		
		System.out.printf("b2->{%s,%.2f,%d}\n", b2.name, b2.weight, b2.price);
	}
}
