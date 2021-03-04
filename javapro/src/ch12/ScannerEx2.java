package ch12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("score.txt"));
		int cnt = 0;
		double totalSum = 0;
		while(scan.hasNextLine()) {	//�Է¹����ſ� ��Ÿ���� ������ ture�� ��ȯ
			String line = scan.nextLine(); // \n�����б�
			Scanner scan2 = new Scanner(line).useDelimiter(","); //,�� ���� ����
			double sum = 0;
			int i = 0;
			String name = scan2.next();
			System.out.print(name + ":");
			while(scan2.hasNextDouble()) {
				double score = scan2.nextDouble();
				sum += score;
				System.out.print(score + ",");
				i++;
			}
			System.out.println("sum="+sum+", avg="+((int)(sum/i*100)/100.0));
			totalSum += sum;
			cnt++;
		}
		System.out.println("count:"+cnt+" totalSum:"+totalSum);
	}
}
