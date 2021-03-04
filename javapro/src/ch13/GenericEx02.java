package ch13;
/*
 제네릭을 이용
 타입을 정하지 않고 class를 구현하는 방법이다.
 class의 멤버, 메소드 파라메터, 리턴 타입, 인터페이스의 타입을 실행시에 적용 할 수 있다
 실행 사용시 제네릭 생략가능함
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
		//제네릭 사용방법
		Pool02<String> box1 = new Pool02<String>();
		box1.set("hello");
		String str = box1.get();
		System.out.println(str);
		
		Pool02 box2 = new Pool02();
		box2.set(6);	
		//생략이 가능하지만 object로 인식해서 캐스팅을 해줘야함.
		int value = (Integer) box2.get();
		System.out.println(value);
	}
}
