package ch06;

public class Exam2 {
	public static void main(String[] args) {
		int [] arr = new int[10];	// arr�� ���� 10¥�� �迭�� ����
		
		for (int i = 0; i < arr.length; i++) {	//i�� 0���� �����ϰ� i�� arr.length[10]���� Ŭ ��� �ݺ� �ߴ�(9)
			arr[i] = (int) (Math.random() * 10 ) + 1;	
			//arr[����]�� ����������ȯ int�� �ְ� random�Լ��� �־� ���� �ֱ�
			//random�� 0.0 ~ 1.0�������� (1~10���� ���) �ڿ� +1�� ��
		}
			for (int a : arr) {		//for each���� a�� arr ���� �ִ´� 
				System.out.print(a + ":");	//���°�� ������ ����� ��� ex) 2:
				for (int i = 0; i < a; i++) {	//��ø for���� �Ἥ a�� 10�� ������ i�� 0~9���� ����
					System.out.print("*");		// *�� ������ŭ
				}
				System.out.println();			//ln�� �ѹ� for���� ������ �ٹٲ�
			}
		}
	}
