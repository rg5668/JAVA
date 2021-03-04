package ch15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class DirectoryToStreamEx1 {
	public static void main(String[] args) throws IOException {
		System.out.println("list() 메서드를 이용하여 스트림 생성하기");
		Path path = Paths.get("src");//src 아래에 있는 폴더 보기
		Stream<Path> sr1 = Files.list(path);
		sr1.forEach(p -> System.out.println(p.getFileName()));
		
		System.out.println("==================================");
		
		System.out.println("find() 메서드를 이용하여 스트림 생성하기");//디렉이 아닌 파일읽기
									//시작, 폴더깊이, 람다
		Stream<Path> sr2 = Files.find(path, 100, (p, b)-> {//b = BasicFileAttributes
//							File file = p.toFile();
					//디렉토리가 아니고 && src파일에 네임에 단어가 포함하는지 //둘다트루면 리턴
							return !b.isDirectory() &&
									p.toFile().getName().contains("Iterator");
							});
		sr2.forEach(p->System.out.println(p.getFileName()));
	}
}
