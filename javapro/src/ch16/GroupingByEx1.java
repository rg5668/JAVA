package ch16;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByEx1 {
	public static void main(String[] args) {
		List<Figure> list = Arrays.asList(
				new Rectangle(10, 3),
				new Circle(10),
				new Rectangle(2, 3),
				new Circle(5));
		//Ÿ���� �׷����� ���´�. Ű, ����(�� ����Ʈ�� �������ִ� ����Ʈ��)
		//Ű�� type ==���̳� �簢��
		//collect�ȿ� ���ִ� �� ������ ����Ҽ��ִ�.
		Map<String, List<Figure>> map =
				list.stream()
				.collect(Collectors.groupingBy(f->f.type));
		
		System.out.println("�簢�� ��� : ");
		map.get("�簢��").stream().forEach(f->System.out.println(f));
		
		System.out.println("���� ��� : ");
		map.get("����").stream().forEach(f->System.out.println(f));
	}
}
