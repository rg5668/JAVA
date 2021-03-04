package ch12;

import java.util.Random;
/*
 * ����(�����Ǽ�)�� �����ϴ� ����� ���� Ŭ������.
 * Math Ŭ������ ramdom() �޼��带 ���ؼ� ������ ������ ���� double �ڷ����� ����������,
 * Random Ŭ������ �̿��ϸ� boolean,int,long,float,double ��
 * �ڷ����� ���� �߻��� �����ϴ�.
 * ���� ������ ����� �˰��� ���Ǵ� ����(seed)���� �����Ͽ� �پ��� ������ ���� �� �� �ִ�
 * seed ���� ���� Random Ŭ������ ���� ������ �����Ѵ�.
 */
public class RandomEx1 {
	public static void main(String[] args) {
		Random rand = new Random();
		rand.setSeed(1);	//������ ���������� ��������ʰ� �ϴ°�
		Random rand2 = new Random();
		//currentTimeMillis ����ð��� ����ؼ� ������ ��� �ٲ�� �۾�
		rand2.setSeed(System.currentTimeMillis());
		System.out.println("rand==>");
		for (int i = 0; i < 6; i++) {
			//nextInt(100) : 0~45 ������ ���� �߻�
			System.out.println(i + ":" + rand.nextInt(45));
		}
		System.out.println();
		System.out.println("rand2==>");
		for (int i = 0; i < 6; i++) {
			System.out.println(i + ":" + rand2.nextInt(45));
		}
	}
}
