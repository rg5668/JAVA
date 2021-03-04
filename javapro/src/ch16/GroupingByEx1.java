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
		//타입을 그룹으로 묶는다. 키, 벨류(는 리스트를 가지고있다 디폴트로)
		//키는 type ==원이나 사각형
		//collect안에 들어가있는 걸 맵으로 사용할수있다.
		Map<String, List<Figure>> map =
				list.stream()
				.collect(Collectors.groupingBy(f->f.type));
		
		System.out.println("사각형 출력 : ");
		map.get("사각형").stream().forEach(f->System.out.println(f));
		
		System.out.println("원형 출력 : ");
		map.get("원형").stream().forEach(f->System.out.println(f));
	}
}
