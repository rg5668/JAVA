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
//���� �о�ͼ� ����Ʈ�ϱ� limit���� 5���� ���
public class FileToStreamEx1 {
	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("src/ch14_Lamda/KICStudent.txt");
		
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());//Charset.defaultCharset()���� Ȯ��
		stream.limit(5).forEach(s->System.out.println(s));
		stream.close();
		System.out.println("=====================");
		
		//BufferedReader�� lines() �޼ҵ� �̿�
		File file = path.toFile();
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);//BufferedReader���۸��� �ǵ���
		br.lines().limit(5).forEach(s->System.out.println(s));
		stream.close();
	}
}
