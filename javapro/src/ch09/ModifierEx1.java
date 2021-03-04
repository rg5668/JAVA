package ch09;

import ch09_1.Modifier2;

//접근 제한자
//				private	<	(default) <	protected <	public
//같은package:	같은calss			O			O			O
//다른package:		X			X		  상속가능			O
class Modifier {
	private int v1 = 100;
			int v2 = 200;
	protected int v3 = v1;
	public void method() {
		System.out.println("chap8.Modifier.method() 메서드임");
		System.out.println("v1 =" + v1);
		System.out.println("v2 =" + v2);
	}
}
class Modifier3 extends Modifier2 {
	public void method() {
		//System.out.println("v1 =" + v1);	//v1 변수의 접근제어자가 private임
		//System.out.println("v2 =" + v2);	//v2 변수의 접근제어자가 (default)임
		System.out.println("v3 =" + v3);	//v3 변수의 접근제어자가 protected임
		System.out.println("v4 =" + v4);	//모든 접근 허용
	}
}
public class ModifierEx1 {
	public static void main(String[] args) {
		Modifier m1 = new Modifier();
//		System.out.println(m1.v1);	//접근 불가
		System.out.println(m1.v2);
		System.out.println(m1.v3);
		m1.method();
		Modifier3 m3 = new Modifier3();
		m3.method();
//		System.out.println("m3.v1="+m3.v1);
//		System.out.println("m3.v2="+m3.v2);
//		System.out.println("m3.v3="+m3.v3);
		System.out.println("m3.v4="+m3.v4);
		
		//Math m = new Math();	//생성자의 접근 제어자가 private임. 객체생성 불가
	}
}
