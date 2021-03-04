package ch14_Lamda;
/*
 * ���ٽ� ���� :jdk8.0 ���� �������� ��밡��.
 * ���ٽĿ��� ����� �� �ִ� �������̽��� �ݵ� FunctionInterface������
 * @FunctionInterface : �������̽����� �߻�޼��尡 �Ѱ���.
 * �Ű������� ����, ���ϰ��� ���� ����
 * 1) �Ű����� ���� : ()->{...}
 * 2) ���ٽ� ���ο��� ����Ǵ� ������ �Ѱ��� ��� { } ���� ����
 */
@FunctionalInterface
interface LambdaInterface1 {
	void method();
}

public class LambadaEx1 {
	public static void main(String[] args) {
		//������ ������� �ڵ�
		//1. �͸� Ŭ���� ���� ���
		LambdaInterface1 fi = new LambdaInterface1() {
			@Override
			public void method() {
				System.out.println("����������� �ڵ�");
			}
		};
		
		//2. ���� Ŭ����
		LambdaInterface1 fi2 = new LamdaClass();
		
		//3. ���ٸ� �̿��� Ŭ���� ����
		LambdaInterface1 fi3 = () -> {
			String str = "method call1";
			System.out.println(str);};
		
		fi.method();//�͸� Ŭ����
		
		fi2.method();//���� Ŭ����
		
		fi3.method();//����

		execute(fi2);//����Ŭ����
		
		System.out.println("=========================");
		//���ٸ� �̿��� Ŭ���� ����
		fi3 = ()->{System.out.println("method call2");};
		fi3.method();
		
		fi3 = ()->{System.out.println("method call3");};
		fi3.method();
		
		fi3 = () -> System.out.println("method call4");
		fi3.method();
		
		//4.�޼ҵ忡 ���� ����
		execute(()->System.out.println("method call5"));
	
	}
	static void execute(LambdaInterface1 f) {
		f.method();
	}
}

class LamdaClass implements LambdaInterface1 {
	@Override
	public void method() {
		System.out.println("Lamda Class �Դϴ�.");
	}
}
