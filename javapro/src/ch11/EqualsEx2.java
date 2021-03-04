package ch11;

class Equal2 {
	int value;
	Equal2(int value) {
		this.value = 10;
	}
	@Override
	public boolean equals(Object obj) {//오버라이딩하면 eqials벨류값으로 비교
		if (obj instanceof Equal2) {
			Equal2 v = (Equal2)obj;
			return value == v.value;
		} else
			return false;
	}
}
public class EqualsEx2 {
	public static void main(String[] args) {
		Equal e1 = new Equal(10);	//주소로 비교
		Equal e2 = new Equal(10);
		if (e1 == e2) {
			System.out.println("e1 객체와 e2 객체는 같은 객체임");
		}else {
			System.out.println("e1 객체와 e2 객체는 다른 객체임");
		}
		if (e1.equals(e2)) {
			System.out.println("e1 객체와 e2 객체의 내용은 같다");
		}else {
			System.out.println("e1 객체와 e2 객체의 내용은 다르다");
		}
	}
}
