package ch15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupingByEx3 {
	static int count=0;
	
	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader br =
				new BufferedReader(new FileReader("src/ch14_Lamda/KICStudent.txt"));
		
		Map<Integer, List<KICStudent>> map =
				br.lines()
				.map(s -> new KICStudent(s))
				.distinct()
				.peek(s -> count++)
				.collect(Collectors.groupingBy(s -> s.grade));
		
		System.out.println("��ü �ο� :" + count + "��");
		
		Set<Entry<Integer, List<KICStudent>>> set = map.entrySet();
		
		for (Entry<Integer, List<KICStudent>> e : set) {
			System.out.println(e.getKey() + "�г� " + " �Ѹ�" + e.getValue().size());
			System.out.println("�г� \t�й� \t�̸� \t���� \t���� \t���� \t����");
			System.out.println("=========================================");
			
			e.getValue()
			.stream()
			.sorted()
			.limit(5)
			.forEach(s -> System.out.println(s));
			
			System.out.println();
		}
	}
}
