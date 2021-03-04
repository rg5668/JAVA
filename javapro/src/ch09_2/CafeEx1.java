package ch09_2;

public class CafeEx1 {
	public static void main(String[] args) {
		Novice novice = new Novice();
		novice.name = "프로도";
		novice.hp = 100;
		
		Wizared wizard = new Wizared();
		wizard.name = "해리포터";
		wizard.hp = 120;
		wizard.mp = 100;
		
		novice.punch();
		wizard.punch();
		
		wizard.fireball();
	}
}

class Novice {
	String name;
	int hp;
	
	public void punch() {
		System.out.printf("[%s]의 펀치!!!\n", name);
	}
}

class Wizared extends Novice {
	int mp;
	
	public void fireball() {
		System.out.printf("fireball = " + hp + "," + mp);
	}
}

