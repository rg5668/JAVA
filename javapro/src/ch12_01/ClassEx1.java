package ch12_01;

class Sample {
	int num;
	@Override
	public String toString() {
		return num+"";
	}
}
public class ClassEx1 {
	public static void main(String[] args) {
		Sample s = new Sample();
		s.num = 99;
		System.out.println(s);
		String classname = "ch12_01.Sample";
		//ch12_01.Sample ���ϸ��� forName�� �־��
		try {
			Class<?> c = Class.forName(classname);
			Sample e = (Sample) c.newInstance(); // ���ο� �ּһ���
			e.num = 10;
			System.out.println(e);
			
			Sample e2 = (Sample) c.newInstance(); // ���ο� �ּһ���
			e2.num = 1010101111;
			System.out.println(e2);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
