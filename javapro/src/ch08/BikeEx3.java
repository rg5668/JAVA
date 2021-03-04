package ch08;

class Bike3 {
	int wheel;
	int price = 10;
	Bike3 (int wheel) {
		this.wheel = wheel;
	}
	void drive() {
		System.out.println("패달을 밟는다.");
	}
	void stop() {
		System.out.println("브레이크를 잡는다.");
	}
}

class AutoBike3 extends Bike3 {
	boolean power; 
	int price = 200;
	AutoBike3 (int wheel) {
		super(wheel);
	}
	void power() {
		power = !power;
		if(power) System.out.println("전원이 켜졌습니다.");
		else System.out.println("전원이 꺼졌습니다.");
	}
	
	@Override
	void drive() {
		if(!power) power();	//power를 호출해서 바꿔라 f를 t로 바꾸면 power부터 호출
	System.out.println(this.price+"원 : 출발 버튼을 누른다.");
	System.out.println(super.price+"원 : 출발 버튼을 누른다.");
	}
	@Override
	void stop() {
		if(power) System.out.println("정지 버튼을 누른다");
		else System.out.println("전원이 꺼졌습니다. 멈출 수 없습니다.");
	}
}
public class BikeEx3 {
	public static void main(String[] args) {
		AutoBike3 auto = new AutoBike3(2);
		System.out.println("가격은" + auto.price + "만원 입니다.");
		auto.drive();
		auto.stop();
		
		Bike3 bike = auto; //*이렇게 하면 자식이 가지고있는 부분을 부모한테 메소드를 준다 //인스턴스변수만 제외
		
		System.out.println("가격은" + bike.price + "만원 입니다.");
		bike.drive();
		bike.stop();
	}
}
