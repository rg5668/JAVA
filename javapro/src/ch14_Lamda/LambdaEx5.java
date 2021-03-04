package ch14_Lamda;
/*
 * ���ٽ��� ��ü�� ���ΰ�ü�� ǥ���ȴ�.
 * local ������ inner class������ ���ÿ��� final ���� ���� �Ѵ�.
 */

interface LambdaInterface5{
	void method();
}

class Outer {
	public int iv = 10;
	
	void method() {
		int iv = 40;
		LambdaInterface5 f5 = () -> {
			//iv = 50; //���ȭ �ʿ�
			System.out.println("Outer.this.iv="+Outer.this.iv);
			System.out.println("this.iv="+this.iv);
			//Outer Ŭ������ iv ���
			System.out.println("iv="+iv);
		};
		f5.method();
	}
}
public class LambdaEx5 {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
		
		LambdaInterface5 f5 = () -> {
			System.out.println("HI");
		};
		f5.method();
	}
}
