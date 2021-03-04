package ch16;

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
				.distinct()	//중복 걸리주기
				.peek(s -> count++)	//중복된거count
				.collect(Collectors.groupingBy(s -> s.grade));//1~4까지 그룹으로 묶은것
		
		System.out.println("전체 인원 :" + count + "명");
		
		Set<Entry<Integer, List<KICStudent>>> set = map.entrySet();//Entry는 두개의 값이 다시 필요할때
		
		for (Entry<Integer, List<KICStudent>> e : set) {
			System.out.println(e.getKey() + "학년 " + " 총명" + e.getValue().size());
			System.out.println("학년 \t학번 \t이름 \t국어 \t영어 \t수학 \t총점");
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
