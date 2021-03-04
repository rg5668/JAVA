package ch13;
/*
 * Ÿ���� ������ ���� ������ pool class�� ����� �����Ѵ�.
 */
class MyClass01 {
	@Override
	public String toString() {
		return "MyClass01";
	}
}

class Pool01 {
	private Object object;
	
	public void set(Object object) {
		this.object = object;
	}
	public Object get() {
		return object;
	}
}
public class GenericEx01 {
	public static void main(String[] args) {
		Pool01 gen = new Pool01();
		gen.set("�׷���");
		String name = (String) gen.get();
		System.out.println(name);
		
		gen.set(new MyClass01());
		MyClass01 g = (MyClass01) gen.get();
		System.out.println(g);
	}
}
