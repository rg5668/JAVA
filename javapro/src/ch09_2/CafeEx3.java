package ch09_2;

class Employee {	//����
	String type, name, addr, affi;
	Employee(String type, String name, String addr, String affi) {
		this.type = type;
		this.name = name;
		this.addr = addr;
		this.affi = affi;
	}
}
class FormalEmployee extends Employee{//��������
	int snum, tmoney, bonus;
	String posi;
	FormalEmployee(String type, String name, String addr, String affi) {
		super("��������", "�Ӱ���", "��⵵ ������", "����");
		this.snum = 1;
		this.tmoney = 1000;
		this.bonus = 1000/10;
	}	
	@Override
		public String toString() {
			return "�������� :" + type + "�̸� :" + name + "�ּ� :" + addr +
					"�ҼӺμ� :" + affi + "���޹�ȣ :" + snum + 
					"���� :" + tmoney + "����" + "���ʽ� :" + bonus + "����";
		}
}
class InFormalEmployee extends Employee{//��������
	String date;
	int bmoney;
	InFormalEmployee(String type, String name, String addr, String affi) {
		super("��������", "�����", "��⵵ ���ν�", "����");
		this.date = "2022-01-15";
		this.bmoney = 5000;
	}
	@Override
		public String toString() {
			return "�������� :" + type + "�̸� :" + name + "�ּ� :" + addr +
					"�ҼӺμ� :" + affi + "���� :" + bmoney + "����" + 
					"��ุ���� :" + date + "����";
		}
}
class TempEmployee extends InFormalEmployee{//�ӽ�����
	int time, mtime;	//�ð�, �ð��� �ӱ�
	TempEmployee(String type, String name, String addr, String affi) {
		super("�ӽ�����", "������", "����� ����", "����");
//		this.time
//		this.mtime
	}	
	
	@Override
		public String toString() {
			return 
		}
}
class InternEmployee extends InFormalEmployee{//���ϻ��
	int Imoeny;
	InternEmployee(String type, String name, String addr, String affi) {
		super("���ϻ��", "�ڰ���", "����� ����", "����");
	}	
	@Override
		public String toString() {
			return
		}
}
public class CafeEx3 {
	public static void main(String[] args) {
		
	}
}
