package ch16;

import java.util.Arrays;
import java.util.List;

public class ReduceEx1 {
	public static void main(String[] args) {
		List<Figure> list = Arrays.asList(new Rectangle(8,8),
				new Circle(5), new Rectangle(2,3));
		//.filter(f->f.type.equals("����"))
		double areaSum = list.stream().mapToDouble(Figure :: area).sum();
		System.out.println("sum()�� �̿��� ���� �հ� :" + areaSum); //���� �� ��ģ
		
		areaSum = list.stream().mapToDouble(Figure :: area).reduce((a,b)->a+b).getAsDouble();
		System.out.println("reduce(Operator)�� �̿��� ���� �հ� : " + areaSum);
		
		areaSum = list.stream().mapToDouble(Figure :: area).reduce(0, (a,b)->a+b);
		System.out.println("reduce(0,Operator)�� �̿��� ���� �հ� :" + areaSum);
	}
}
