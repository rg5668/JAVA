package ch11;

class Equal2 {
	int value;
	Equal2(int value) {
		this.value = 10;
	}
	@Override
	public boolean equals(Object obj) {//�������̵��ϸ� eqials���������� ��
		if (obj instanceof Equal2) {
			Equal2 v = (Equal2)obj;
			return value == v.value;
		} else
			return false;
	}
}
public class EqualsEx2 {
	public static void main(String[] args) {
		Equal e1 = new Equal(10);	//�ּҷ� ��
		Equal e2 = new Equal(10);
		if (e1 == e2) {
			System.out.println("e1 ��ü�� e2 ��ü�� ���� ��ü��");
		}else {
			System.out.println("e1 ��ü�� e2 ��ü�� �ٸ� ��ü��");
		}
		if (e1.equals(e2)) {
			System.out.println("e1 ��ü�� e2 ��ü�� ������ ����");
		}else {
			System.out.println("e1 ��ü�� e2 ��ü�� ������ �ٸ���");
		}
	}
}
