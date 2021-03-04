package ch09_2;

interface MyInterface1 {
	void method();
	default void method1() {
		System.out.println("MyInterface1의 디플트 메서드 method1()");
	}
	static void staticMethod() {
		System.out.println("MyInterface1의 static 메서드 : staticMethod()");
	}
}
interface MyInterface2 {
	void method();
	default void method1() {
		System.out.println("MyInterface2의 디플트 메서드 method1()");
	}
	static void staticMethod() {
		System.out.println("MyInterface2의 static 메서드 : staticMethod()");
	}
}
class Parent {
	public void method2() {
		System.out.println("Parent 클래스의 멤버 메서드 : method2();");
	}
}
class Child extends Parent implements MyInterface1, MyInterface2 {
	/*
	 * MyInterface1, MyInterface2 인터페이스의 method1 default 메서드가 충돌발생
	 * => Child 클래스에서 반드시 오버라이딩 해야함.
	 */
	@Override
	public void method1() {
		System.out.println("Child 클래스의 method1() 메서드");
	}
	static void staticMethod() {
		System.out.println("==================");
	}
	@Override
	public void method() {
		System.out.println("Child 클래스의 method()");
		System.out.println("MyInterface1, MyInterface2 인터페이스의 method 오버라이딩함");
	}
	
}
public class DefaultInterfaceEx1 {
	public static void main(String[] args) {
		Child c  = new Child();
		c.method1();
		c.method2();
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();
	}
}
