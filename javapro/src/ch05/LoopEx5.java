package ch05;

public class LoopEx5 {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			System.out.println("\n"+i+"��");
			for (int j = 2; j <= 9; j++) {
				if(j==5) continue; 
				// 5�ܸ� ���� ���� ����(�ݺ����� ó������ ��� �̵�)
//				if(j==5) break; 
				// �������� ��������
				
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}
}
