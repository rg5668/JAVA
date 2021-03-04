package ch13;

class Generic7 <T> {
	T[] t;
	
	void set(T[] n) {
		t = n;
	}
	T[] get() {
		return t;
	}
	void print() {
		for (T o : t)
			System.out.print(o + ",");
		System.out.println();
	}
}
public class GenericEx07 {
	public static void main(String[] args) {
		Generic7<String> sg = new Generic7<String>();
		String[] ss = {"  월매   ","   춘향   ","   향단   "};
		sg.set(ss);
		sg.print();
		String[] objs = sg.get();
		for (Object o : objs) {
			String s = (String) o;
			System.out.println("["+s.trim()+"]");
		}
		Generic7<Integer> ig = new Generic7<Integer>();
		Integer[] ii = {1,2,3};
		ig.set(ii);
		Integer[] iig = ig.get();
		ig.print();
		for (Object o : iig) {
			Integer s = (Integer) o;
			System.out.println(s);
		}
	}
}
