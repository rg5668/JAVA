package ch05;

public class SwitchNoBreak {
	public static void main(String[] args) {
		String levelString = "";
		String level = "������";
		switch(level) {
		case "������":
			levelString += "��ڰ���";
		case "���":
			levelString += "ȸ������";
		case "�۾���":
			levelString += "�۾���";
		default:
			levelString += "����";
		}
		System.out.println("����� ������ :" + levelString);
	}
}
