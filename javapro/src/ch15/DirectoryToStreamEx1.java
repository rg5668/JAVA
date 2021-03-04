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
		System.out.println("list() �޼��带 �̿��Ͽ� ��Ʈ�� �����ϱ�");
		Path path = Paths.get("src");//src �Ʒ��� �ִ� ���� ����
		Stream<Path> sr1 = Files.list(path);
		sr1.forEach(p -> System.out.println(p.getFileName()));
		
		System.out.println("==================================");
		
		System.out.println("find() �޼��带 �̿��Ͽ� ��Ʈ�� �����ϱ�");//���� �ƴ� �����б�
									//����, ��������, ����
		Stream<Path> sr2 = Files.find(path, 100, (p, b)-> {//b = BasicFileAttributes
//							File file = p.toFile();
					//���丮�� �ƴϰ� && src���Ͽ� ���ӿ� �ܾ �����ϴ��� //�Ѵ�Ʈ��� ����
							return !b.isDirectory() &&
									p.toFile().getName().contains("Iterator");
							});
		sr2.forEach(p->System.out.println(p.getFileName()));
	}
}
