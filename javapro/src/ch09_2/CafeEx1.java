package ch09_2;

public class CafeEx1 {
	public static void main(String[] args) {
		Novice novice = new Novice();
		novice.name = "���ε�";
		novice.hp = 100;
		
		Wizared wizard = new Wizared();
		wizard.name = "�ظ�����";
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
		System.out.printf("[%s]�� ��ġ!!!\n", name);
	}
}

class Wizared extends Novice {
	int mp;
	
	public void fireball() {
		System.out.printf("fireball = " + hp + "," + mp);
	}
}

