package ch05;

public class LabelTest {
	public static void main(String[] args) {
		outer:for (int i = 1; i < 10; i++) {
			inner:for (int j = 1; j < 10; j++) {
				if (j == 5) {
					break;	//�� �ܺ��� *4������ ���
//					break inner; // break�� ����
//					break outer; // 1*4������ ���
//					continue; // *5�� �����ϰ� ���
//					continue inner; // continue�� ����
//					continue outer; //*5�� ������ �� ������ ����
				}
				System.out.printf("%d*%d=%d\t", i,j, i*j);
			}
			System.out.println();
		}
	}
}
