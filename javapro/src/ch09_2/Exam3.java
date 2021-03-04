package ch09_2;

interface RemoteControl1 {
}
interface RemoteControl {
	
	void turnOn();
	void turnOff();
	void setVolume(int volumn);
	default void setMute(boolean state) {
		if(state)
			System.out.println("���� ó���մϴ�.");
		else
			System.out.println("������ �����մϴ�.");
	}
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
class Television implements RemoteControl,RemoteControl1 {
	int num = 0;
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volumn) {
		System.out.println("TV�� ������" + volumn + "���� �����մϴ�.");
	}
}
class Audio implements RemoteControl,RemoteControl1 {
	
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volumn) {
		System.out.println("Audio�� ������" + volumn + "���� �����մϴ�.");
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
