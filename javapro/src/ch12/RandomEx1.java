package ch12;

import java.util.Random;
/*
 * 난수(임의의수)를 생성하는 기능을 가진 클래스다.
 * Math 클래스의 ramdom() 메서드를 통해서 난수를 생성할 떄는 double 자료형만 가능했으나,
 * Random 클래스를 이용하면 boolean,int,long,float,double 등
 * 자료형별 난수 발생이 가능하다.
 * 또한 난수를 만드는 알고리즘에 사용되는 종자(seed)값을 설정하여 다양한 난수를 생성 할 수 있다
 * seed 값이 같은 Random 클래스는 같은 난수를 산출한다.
 */
public class RandomEx1 {
	public static void main(String[] args) {
		Random rand = new Random();
		rand.setSeed(1);	//난수의 고정값으로 변경되지않게 하는거
		Random rand2 = new Random();
		//currentTimeMillis 현재시간을 사용해서 난수가 계속 바뀌도록 작업
		rand2.setSeed(System.currentTimeMillis());
		System.out.println("rand==>");
		for (int i = 0; i < 6; i++) {
			//nextInt(100) : 0~45 정수형 난수 발생
			System.out.println(i + ":" + rand.nextInt(45));
		}
		System.out.println();
		System.out.println("rand2==>");
		for (int i = 0; i < 6; i++) {
			System.out.println(i + ":" + rand2.nextInt(45));
		}
	}
}
