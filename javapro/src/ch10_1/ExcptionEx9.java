package ch10_1;

import java.io.IOException;
/*
 * �������̵� �� �޼����� ����ó���� �θ�޼�����
 * ����ó���� ���ų� �ڼ� Exception�� �����ϴ�.
 * ���� ���þ��� ����ó���� �ȵȴ�.
 */
class Parent {
	void method(int i) throws Exception {
		System.out.println(i);
	}
}
class Child extends Parent {
	@Override
	void method(int i) throws IOException {
		System.out.println(i);
		try {
			throw new IOException();
		} catch (IOException e) {
			
		}
	}
}
public class ExcptionEx9 {
	
}