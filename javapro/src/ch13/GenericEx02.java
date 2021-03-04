package ch13;
/*
 ���׸��� �̿�
 Ÿ���� ������ �ʰ� class�� �����ϴ� ����̴�.
 class�� ���, �޼ҵ� �Ķ����, ���� Ÿ��, �������̽��� Ÿ���� ����ÿ� ���� �� �� �ִ�
 ���� ���� ���׸� ����������
 */

class Pool02<T> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
}
public class GenericEx02 {
	public static void main(String[] args) {
		//���׸� �����
		Pool02<String> box1 = new Pool02<String>();
		box1.set("hello");
		String str = box1.get();
		System.out.println(str);
		
		Pool02 box2 = new Pool02();
		box2.set(6);	
		//������ ���������� object�� �ν��ؼ� ĳ������ �������.
		int value = (Integer) box2.get();
		System.out.println(value);
	}
}
