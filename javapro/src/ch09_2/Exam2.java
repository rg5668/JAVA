package ch09_2;

interface Repairable {
}
class Unit {
	int hp;
	final int MAX;
	
	Unit(int hp) {
		this.MAX = hp;
		this.hp = hp;
	}
}
class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}
class GroundUnit extends Unit {
	GroundUnit(int hp) {
		super(hp);
	}
}
class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(1);
	}
	@Override
	public String toString() {
		return "Tank";
	}
}
class DropShip extends GroundUnit implements Repairable {
	DropShip() {
		super(2);
	}
	@Override
	public String toString() {
		return "DropShip";
	}
}
class Marine implements Repairable {
	@Override
	public String toString() {
		return "Marine";
	}
}
class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(3);
	}
	@Override
	public String toString() {
		return "SCV";
	}
	void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit) r;
			u.hp = u.MAX;
			System.out.println(r + "수리완료");
		}
//		if(r instanceof Tank)
//			System.out.println(r+"수리완료");
//		if(r instanceof DropShip)
//			System.out.println(r+"수리완료");
//		if(r instanceof Marine)
//			System.out.println(r+"수리완료");
//		if(r instanceof SCV)
//			System.out.println(r+"수리완료");
	}
}
public class Exam2 {
	public static void main(String[] args) {
		Tank t = new Tank();
		DropShip d = new DropShip();
		Marine m = new Marine();
		SCV s = new SCV();
		s.repair(t);
		s.repair(d);
		s.repair(m);	//error
		s.repair(s);
	}
}
