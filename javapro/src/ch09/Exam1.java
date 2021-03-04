package ch09;

class SutdaCard {
	int number;
	boolean isKwang;
	
	SutdaCard(int number, boolean isKwang){
		this.number = number;
		this.isKwang = isKwang;
	}
	SutdaCard() {
		this.number = 1;
		this.isKwang = true;
	}
	void info () {
		System.out.println(this);
	}
	@Override
	public String toString() {
		return number + ((isKwang)? "K" : "");
	}
}

class SutdaDeck {
	SutdaCard cards[] = new SutdaCard[20];
	
	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			cards[i] = new SutdaCard((i%10) + 1,
					(i==0 || i==2 || i==7) ? true : false);
		}
	}
	@Override
	public String toString() {
		String result = "";
		for (SutdaCard c : cards) {
			result += c.toString() + ",";
			}return result;
	}
	void shuffle() {
		for (int i = 0; i <= 1000; i++) {
			int f = (int) (Math.random()*20);
			int t = (int) (Math.random()*20);
			SutdaCard tmp = cards[f];
			cards[f] = cards[t];
			cards[t] = tmp;
		}
	}
	SutdaCard pick(int index) {
		return cards[index];
	}
	SutdaCard pick() {
		int i = (int) (Math.random()*20);
		return cards[i];
	}
	
}

public class Exam1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		//1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10
		System.out.println(deck);
		deck.shuffle();
		System.out.println(deck);
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
	}
}
