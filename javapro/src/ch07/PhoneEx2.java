package ch07;

public class PhoneEx2 {
	
	public static void main(String[] args) {
		Phone[] parr = new Phone[3];	//�迭 3�� ����
		for (int i = 0; i < parr.length; i++) {//i�� 0���� 3���� ����������
			Phone p = new Phone();	//PhoneEx1�� �ִ� Ŭ���� ������
			parr[i] = p;			//�迭 = ����
			parr[i].no = i + "1234";//PhoneEx1 ����.�ν��Ͻ�����=i+����
		}
		for (int i = 0; i < parr.length; i++) {//i�� 0���� 3���� ����������
			//Ŭ����.����.�޼ҵ�(parr[0].no01234)
			System.out.printf("parr[%d].no%s\n",i,parr[i].no);
			//21234�� ��ȭ �۽� ��~
			//parr[0].send �ȿ� ((0==0)���̸� �տ� ���� ����
			//���̸� �迭.����-1�� ��� : �����̸� �迭-1
			parr[i].send((i==0)?parr[parr.length -1].no : parr[i-1].no);
		}
	}
}
