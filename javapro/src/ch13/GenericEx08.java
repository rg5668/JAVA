package ch13;

class MyArrayList<T> {
	Object[] v = new Object[3];
	int index = 0;
	public void add(T t) {
		if (index == v.length) {//0==3 falus여서 실행 x
			System.out.print("length 추가" + v.length);
			Object[] temp = new Object[v.length + 2];//2개씩추가
			System.arraycopy(v, 0, temp, 0, v.length);
			v = temp;
		}
		v[index++] = t;//집어넣고 index증가
	}
	public T get(int i) {
		return (T) v[i];
	}
	public void list() {
		for (Object s : v) {
			if(s == null)
				break;
			System.out.print((T) s + ",");
		}
		System.out.println();
	}
}
public class GenericEx08 {
	public static void main(String[] args) {
		MyArrayList <String> t1 = new MyArrayList<String>();
		t1.add("월매");
		t1.add("춘향");
		t1.add("향단");
		System.out.println(t1.get(2));
		t1.list();
		System.out.println("=========================");
		
		MyArrayList<Integer> t2 = new MyArrayList<Integer>();
		t2.add(1);
		t2.add(2);
		t2.add(3);
		t2.add(4);
		t2.add(5);
		t2.add(6);
		t2.add(7);
		System.out.println(t2.get(6));//7
		t2.list();
	}
}
