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
		return "���";
	}
}
class Peach extends Fruit{
	Peach(int price, double brix) {
		super(price, brix);
	}
	@Override
	public String toString() {
		return "������";
	}
}
class Coke extends Drink{
	Coke(int price, int ml) {
		super(price, ml);
	}
	@Override
	public String toString() {
		return "�ݶ�";
	}
}
class Sidar extends Drink{
	Sidar(int price, int ml) {
		super(price, ml);
	}
	@Override
	public String toString() {
		return "���̴�";
	}
}
class Biscuit extends Snack {
	Biscuit(int price, int gram) {
		super(price, gram);
	}
	@Override
	public String toString() {
		return "��Ŷ";
	}
}
class Cookie extends Snack{
	Cookie(int price, int gram) {
		super(price, gram);
	}
	@Override
	public String toString() {
		return "��Ű";
	}
}

class Buyer2 {
	int money = 10000;
	int point;
	Food cart[] = new Food[20];
	int cnt;
	
	void buy(Food f) {
		if (money < f.price) {
			System.out.println(f + "���Ž� �ܾ׺���");
			return;
		}
		money -= f.price;
		point += f.point;
		System.out.println(f + " : ����=" + f.price + "����");
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
		System.out.println("�ѱ��� �ݾ�" + total + ",�ѱ��ŰǼ�" + cnt);
		System.out.println("���ϱ��� �ݾ�" + ftotal + ",���ϱ��ŰǼ�" + fcnt);
		System.out.println("���ϱ��� ���" + flist);
		System.out.println("���ᱸ�� �ݾ�" + dtotal + ",���ᱸ�ŰǼ�" + dcnt);
		System.out.println("���ᱸ�� ���" + dlist);
		System.out.println("���ڱ��� �ݾ�" + stotal + ",���ڱ��ŰǼ�" + scnt);
		System.out.println("���ڱ��� ���" + slist);
	}
}
public class Exam3 {
	public static void main(String[] args) {
		Apple apple = new Apple(1000, 10.5);
		System.out.println("��� ����:" + apple.price);
		System.out.println("��� �絵:" + apple.brix);
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
		System.out.println("�� ����:" + b.cnt);
		System.out.println("�� �ܾ�:" + b.money);
		System.out.println("�� ����Ʈ:" + b.point);
		b.summary();
	}
}
