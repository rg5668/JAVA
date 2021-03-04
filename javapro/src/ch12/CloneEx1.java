package ch12;
//Ŭ���� protected�� �ܺ� Ŭ�������� ��������
//Object�� clone()�� protected�̱� ������ clone() �޼ҵ带 �� override �ؾ���
//clss���ο��� ��� �Ͽ����Ѵ�.
//clone()�� �ݵ�� ����ó���� ���־�� �Ѵ�.
//clone()�� ���� �Ϸ��� Cloneable�� implements�ؾ��Ѵ�. (������ �ֿܼ��� ����)
class Point implements Cloneable{ 
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "x=" + x + ", y=" + y;
	}
	
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
}
public class CloneEx1 {
	public static void main(String[] args) {
		Point original = new Point(3,5);
		Point copy = (Point) original.clone();//����clone�ؼ� ���ο� ��ü�� ����
		System.out.println(original);
		System.out.println(copy);
	}
}
