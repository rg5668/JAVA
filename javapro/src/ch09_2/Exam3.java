package ch09_2;

interface RemoteControl1 {
}
interface RemoteControl {
	
	void turnOn();
	void turnOff();
	void setVolume(int volumn);
	default void setMute(boolean state) {
		if(state)
			System.out.println("무음 처리합니다.");
		else
			System.out.println("무음을 해제합니다.");
	}
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
class Television implements RemoteControl,RemoteControl1 {
	int num = 0;
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volumn) {
		System.out.println("TV의 볼륨을" + volumn + "으로 설정합니다.");
	}
}
class Audio implements RemoteControl,RemoteControl1 {
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volumn) {
		System.out.println("Audio의 볼륨을" + volumn + "으로 설정합니다.");
	}
}
public class Exam3 {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		Television r1 = new Television();
		r1.num=8;
		r1.turnOff();
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
		rc.setMute(true);
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(20);
		rc.setMute(false);
		RemoteControl.changeBattery();
	}
}
