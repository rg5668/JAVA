package ch11;

class Equal {
	int value;
	Equal(int value) {
		this.value = value;
	}
	@Override
	public boolean equals(Object obj) {//오버라이딩하면 equals벨류값으로 비교
		Equal v = (Equal) obj;
		return value == v.value;
	}
}
public class EqualsEx1 {
	public static void main(String[] args) {
		Equal e1 = new Equal(10);	//주소로 비교
		Equal e2 = new Equal(10);
		if (e1 == e2) {
			System.out.println("e1 객체와 e2 객체는 같은 객체임");
		}else {
			System.out.println("e1 객체와 e2 객체는 다른 객체임");
		}
		if (e1.equals(e2)) {	//e1.equals로 가서 v.value와 e2의 value와 같으면 트루
			System.out.println("e1 객체와 e2 객체의 내용은 같다");
		}else {
			System.out.println("e1 객체와 e2 객체의 내용은 다르다");
		}
	}
}
