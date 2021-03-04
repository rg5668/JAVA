package ch13;
/*
 * ������ ������ ��ü�� �ڼ� (Child) Class����
 * ���׸� Ÿ������ �Է� �� �� �ֵ��� �����Ѵ�
 * <T extends Number> Number�� �ڼո��� �Է� �� �� �ִ�.
 * (Wrapper �� ���� ������)
 * <T super Number>�� class ���ǽ� ��� �� �� ���� ����� ��밡��
 */
class Pool05<T extends Number> {
	T v;
	Pool05(T n) {
		v = n;
	}
	void set(T n) {
		v =n;
	}
	T get() {
		return v;
	}
}

class Util05 {
	//���������� <Ÿ���Ķ����> ����Ÿ��<Ÿ��> �޼ҵ��(�Ű�����)
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		System.out.println(t1.getClass().getName());//���� Ÿ������
		System.out.println(t2.getClass().getName());
		return Double.compare(v1, v2);
	}
}

public class GenericEx05 {
	public static void main(String[] args) {
		//String str = Util.compare("a","b"); //���׸� �޼ҵ� compare
		int result1 = Util05.compare(10, 20);	//compare �� ���� ũ�� 1 ������ 0 ������ -1
		System.out.println(result1);
		int result2 = Util05.compare(4.5, 3);
		System.out.println(result2);
		
		Pool05<Integer> p1 = new Pool05<Integer>(20);
		Pool05<Double> p2 = new Pool05<Double>(20.0);
//		Pool05<String> p3 = new Pool05<Double>("hello"));
//		Pool05<Character> p4 = new Pool05<Double>('a');
		Pool05<Byte> p5 = new Pool05<Byte>((byte)1);
		int value = p1.get();
		System.out.println(value);
		System.out.println(p2.get());
		System.out.println(p5.get());
	}
}
