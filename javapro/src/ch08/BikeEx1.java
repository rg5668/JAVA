package ch08;

class Bike {
	int wheel;
	
	Bike(int wheel) {
		this.wheel = wheel;
	}
	String drive() {
		return "����� ��´�.";
	}
	String stop() {
		return "�극��ũ�� ��´�.";
	}
}

class AutoBike extends Bike {
	boolean power;
	
	AutoBike(int wheel) {
		super(wheel);
	}
	void power() {
		power = !power;
	}
	@Override
	String drive() {
		if(!power) power();
		return "��� ��ư�� ������";
	}
	@Override
	String stop() {
		if(power) 
			return "���� ��ư�� ������";
		else
		return "�̹� �����Ǿ� ����.";
	}
}
public class BikeEx1 {
	public static void main(String[] args) {
		AutoBike ab = new AutoBike(4);
		System.out.println(ab.drive());
		System.out.println("����" + ab.wheel + "���� ��������.");
		System.out.println(ab.stop());
		System.out.println("õõ�� �����.");
		System.out.println("=======================");
		
		Bike bi = new Bike(2);
		System.out.println(bi.drive());
		System.out.println("����" + bi.wheel + "���� ��������.");
		System.out.println(bi.stop());
		System.out.println("õõ�� �����.");
	}
}
