package ch14_02;

import java.util.Stack;

public class StackQueueEx3 {
	public static Stack<String> back = new Stack<String>();
	public static Stack<String> forward = new Stack<String>();
	
	public static void main(String[] args) {
		goURL("1.����Ʈ"); goURL("2.����"); goURL("3.���̹�");
		goURL("4.����");
		printStatus();
		goBack();
		System.out.println("= �ڷΰ��� ��ư�� ���� �� =");
		printStatus();
		goBack();
		System.out.println("= '�ڷ�' ��ư�� ���� �� =");
		printStatus();
		goForward();
		System.out.println("= '������' ��ư�� ���� �� = ");
		printStatus();
		goURL("sist.com");
		System.out.println("= ���ο� �ּҷ� �̵� �� =");
		printStatus();
	}
	
	public static void printStatus() {
		System.out.println("back:" + back);
		System.out.println("forward:" + forward);
		System.out.println("����ȭ���� '" + back.peek() + "'�Դϴ�.");//��ü�� ��ȸ
		System.out.println();
	}
	public static void goURL(String url) {
		back.push(url);
		if (!forward.empty()) {// !forward�� ������� ������ ����
			forward.clear();
		}
	}
	public static void goBack() {
		if (!back.empty()) {
			forward.push(back.pop());
		}
	}
	public static void goForward() {
		if (!forward.empty()) {
			back.push(forward.pop());
		}
	}
}
