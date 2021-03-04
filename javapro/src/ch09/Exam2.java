package ch09;


class Product {
	int price;
	int point;
	
	Product(int price) {
		this.price = price;
		this.point = price/10;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}
	@Override
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super (200);
	}
	@Override
	public String toString() {
		return "Computer";
	}
}

class SmartPhone2 extends Product {
	SmartPhone2() {
		super (150);
	}
	@Override
	public String toString() {
		return "SmartPhone";
	}
}

class Buyer {
	int money = 500;
	int point;
	Product cart[] = new Product[3];
	int cnt;
	
	void buy(Product p) {
		money -= p.price;
		point += p.point;
		System.out.println(p + "구매함");
		cart[cnt++] = p;
	}
	
	void summary() {
		int sum = 0;
		String productList = "";
		for (Product p : cart) {
			if (p == null)
				break;
			System.out.println(p + "상품 : 가격=" + p.price + ",포인트=" + p.point);
			productList += p + ",";
			sum += p.price;
		}
		System.out.println("총물품구매액" + sum);
		System.out.println("총물품목록" + productList);
	}
}
public class Exam2 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		SmartPhone2 sp = new SmartPhone2();
		b.buy(tv);
		b.buy(com);
		b.buy(sp);
		System.out.println("구매후 잔액:" + b.money);
		System.out.println("구매후 적립포인트:" + b.point);
		System.out.println("======= 구매 제품 정보 =======");
		b.summary();
	}
}
