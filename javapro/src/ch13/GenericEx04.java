package ch13;
/*
 */
class Pool04<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

class Util04 {
	//접근제어자 <타입파라미터> 리턴타입<타입> 메소드명(매개변수)
	public static <T> Pool04<T> staticMethod(T t) {
		Pool04<T> box = new Pool04<T>();	//생성
		box.set(t);
		return box;//Pool04리턴
	}
	public <T> Pool04<T> instanceMethod1(T t) {
		Pool04<T> box = new Pool04<T>();
		box.set(t);
		return box;	//Pool04를 리턴
	}
	public <T> String instanceMethod2(T t) {
		return t.toString();
	}
}
class MyCar{
	@Override
	public String toString() {
		return "myCar";
	}
}
public class GenericEx04 {
	public static void main(String[] args) {
		Pool04<Integer> box1 = Util04.staticMethod(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Util04 u = new Util04();
		Pool04<String> box2 = u.instanceMethod1("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);
		
		System.out.println(u.instanceMethod2("김자바"));
		System.out.println(u.instanceMethod2(new MyCar()));
	}
}
