package ch09_2;

enum Family {
	FATHER("�ƺ�"), MOTHER("����"), SON("�Ƶ�"), DAUGHTER("��");
	private String kor;
	
	Family(String kor) {
		this.kor = kor;
	}
	public String getKor() {
		return kor;
	}
	public void setKor(String kor) {
		this.kor = kor;
	}
}
public class UseConstructorTest {
	public static void main(String[] args) {
		Family current = Family.MOTHER;
		System.out.printf("�� Ȯ��: %s, kor: %s%n", current, current.getKor());
		current.setKor("��Ӵ�");
		System.out.printf("�� Ȯ��: %s, kor: %s%n", current, current.getKor());
	}
}
