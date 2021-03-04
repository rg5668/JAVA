package ch09;

class Food {
	int price, point;
	
	Food(int price) {
		this.price = price;
		this.point = price/10;
	}
}

class Fruit extends Food{
	double brix;
	
	Fruit (int price, double brix) {
		super(price);
		this.brix = brix;
	}
}
class Drink extends Food{
	int ml;
	
	Drink (int price, int ml) {
		super(price);
		this.ml = ml;
	}
}
class Snack extends Food{
	int gram;
	
	Snack (int price, int gram) {
		super(price);
		this.gram = gram;
	}
}
class Apple extends Fruit{
	Apple(int price, double brix) {
		super(price, brix);
	}
	@Override
	public String toString() {
		return "사과";
	}
}
class Peach extends Fruit{
	Peach(int price, double brix) {
		super(price, brix);
	}
	@Override
	public String toString() {
		return "복숭아";
	}
}
class Coke extends Drink{
	Coke(int price, int ml) {
		super(price, ml);
	}
	@Override
	public String toString() {
		return "콜라";
	}
}
class Sidar extends Drink{
	Sidar(int price, int ml) {
		super(price, ml);
	}
	@Override
	public String toString() {
		return "사이다";
	}
}
class Biscuit extends Snack {
	Biscuit(int price, int gram) {
		super(price, gram);
	}
	@Override
	public String toString() {
		return "비스킷";
	}
}
class Cookie extends Snack{
	Cookie(int price, int gram) {
		super(price, gram);
	}
	@Override
	public String toString() {
		return "쿠키";
	}
}

class Buyer2 {
	int money = 10000;
	int point;
	Food cart[] = new Food[20];
	int cnt;
	
	void buy(Food f) {
		if (money < f.price) {
			System.out.println(f + "구매시 잔액부족");
			return;
		}
		money -= f.price;
		point += f.point;
		System.out.println(f + " : 가격=" + f.price + "구입");
		cart[cnt++] = f;
	}
	
	void summary() {
		int total = 0, ftotal = 0, dtotal = 0, stotal =0;
		int fcnt = 0, dcnt = 0, scnt = 0;
		String flist = "", dlist = "", slist = "";
		for (Food f : cart) {
			if (f == null)
				break;
			total += f.price;
			if (f instanceof Fruit) {
				fcnt++;
				ftotal += f.price;
				flist += f + ",";
			}
			if (f instanceof Drink) {
				dcnt++;
				dtotal += f.price;
				dlist += f + ",";
			}
			if (f instanceof Snack) {
				scnt++;
				stotal += f.price;
				slist += f + ",";
			}
		}
		System.out.println("총구매 금액" + total + ",총구매건수" + cnt);
		System.out.println("과일구매 금액" + ftotal + ",과일구매건수" + fcnt);
		System.out.println("과일구매 목록" + flist);
		System.out.println("음료구매 금액" + dtotal + ",음료구매건수" + dcnt);
		System.out.println("음료구매 목록" + dlist);
		System.out.println("과자구매 금액" + stotal + ",과자구매건수" + scnt);
		System.out.println("과자구매 목록" + slist);
	}
}
public class Exam3 {
	public static void main(String[] args) {
		Apple apple = new Apple(1000, 10.5);
		System.out.println("사과 가격:" + apple.price);
		System.out.println("사과 당도:" + apple.brix);
		Peach peach = new Peach(1000, 13.5);
		Coke coke = new Coke(500, 500);
		Sidar sidar = new Sidar(1500, 1000);
		Biscuit bis = new Biscuit(10000, 500);
		Cookie cookie = new Cookie(500, 5000);
		
		Buyer2 b = new Buyer2();
		b.buy(apple);
		b.buy(peach);
		b.buy(coke);
		b.buy(sidar);
		b.buy(bis);
		b.buy(cookie);
		System.out.println("총 개수:" + b.cnt);
		System.out.println("고객 잔액:" + b.money);
		System.out.println("고객 포인트:" + b.point);
		b.summary();
	}
}
