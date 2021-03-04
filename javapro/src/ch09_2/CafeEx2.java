package ch09_2;
class Foo {
	static void alpha() {
		System.out.println("bbb");
	}
	void beta() {
		System.out.println("aaa");
	}
}
public class CafeEx2 {
	public static void main(String[] args) {
		Foo.alpha();
		Foo f = new Foo();
		System.out.println("---------");
		f.beta();
	}
}
