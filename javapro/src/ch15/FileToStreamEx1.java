package ch15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
//파일 읽어와서 프린트하기 limit으로 5개만 출력
public class FileToStreamEx1 {
	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("src/ch14_Lamda/KICStudent.txt");
		
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());//Charset.defaultCharset()문자 확인
		stream.limit(5).forEach(s->System.out.println(s));
		stream.close();
		System.out.println("=====================");
		
		//BufferedReader의 lines() 메소드 이용
		File file = path.toFile();
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);//BufferedReader버퍼링된 판독기
		br.lines().limit(5).forEach(s->System.out.println(s));
		stream.close();
	}
}
