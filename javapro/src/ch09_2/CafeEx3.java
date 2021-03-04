package ch09_2;

class Employee {	//직원
	String type, name, addr, affi;
	Employee(String type, String name, String addr, String affi) {
		this.type = type;
		this.name = name;
		this.addr = addr;
		this.affi = affi;
	}
}
class FormalEmployee extends Employee{//정규직원
	int snum, tmoney, bonus;
	String posi;
	FormalEmployee(String type, String name, String addr, String affi) {
		super("정규직원", "임건희", "경기도 성남시", "개발");
		this.snum = 1;
		this.tmoney = 1000;
		this.bonus = 1000/10;
	}	
	@Override
		public String toString() {
			return "직원구분 :" + type + "이름 :" + name + "주소 :" + addr +
					"소속부서 :" + affi + "직급번호 :" + snum + 
					"연봉 :" + tmoney + "만원" + "보너스 :" + bonus + "만원";
		}
}
class InFormalEmployee extends Employee{//비정규직
	String date;
	int bmoney;
	InFormalEmployee(String type, String name, String addr, String affi) {
		super("비정규직", "김건희", "경기도 용인시", "생산");
		this.date = "2022-01-15";
		this.bmoney = 5000;
	}
	@Override
		public String toString() {
			return "직원구분 :" + type + "이름 :" + name + "주소 :" + addr +
					"소속부서 :" + affi + "연봉 :" + bmoney + "만원" + 
					"계약만료일 :" + date + "까지";
		}
}
class TempEmployee extends InFormalEmployee{//임시직원
	int time, mtime;	//시간, 시간당 임금
	TempEmployee(String type, String name, String addr, String affi) {
		super("임시직원", "오건희", "서울시 강남", "개발");
//		this.time
//		this.mtime
	}	
	
	@Override
		public String toString() {
			return 
		}
}
class InternEmployee extends InFormalEmployee{//인턴사원
	int Imoeny;
	InternEmployee(String type, String name, String addr, String affi) {
		super("인턴사원", "박건희", "서울시 강서", "개발");
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
