package ch07;


class Number1 {
	int num;
	//����Ʈ �����ڰ� �ڵ����� ����
}

class Number2 {
	int num;
	
	Number2() {	//����Ʈ ������ 
		
	}
	Number2(int x) {	//������
		num = x;
	}
}
public class ConstructorEx1 {
	public static void main(String[] args) {
		Number1 n1 = new Number1();
		n1.num = 10;
		Number2 n2 = new Number2();
		Number2 n3 = new Number2(20);
		System.out.println("Number1 Ŭ������ num=" + n1.num);
		System.out.println("Number2 Ŭ������ num=" + n2.num);
		System.out.println("Number2 (Ÿ��) Ŭ������ num=" + n3.num);
	}
}
