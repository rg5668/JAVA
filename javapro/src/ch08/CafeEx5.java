package ch08;

class Food {
	String name;
	int price;
	
	Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return name + "(" + price + ")";
	}
}

public class CafeEx5 {
	public static void main(String[] args) {
		Food chicken = new Food("치킨", 18000);
		Food pizza = new Food("피자", 28000);
		Food sushi = new Food("초밥세트", 22000);
		
		Food[] foods = {chicken, pizza, sushi};
		
		for (int i = 0; i < foods.length; i++) {
			System.out.println(foods[i].toString());
		}
	}
}
