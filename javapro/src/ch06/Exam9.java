package ch06;

public class Exam9 {
	public static void main(String[] args) {
		int score[][] = {
				{100,80,90},{80,95,100},{60,65,70},{85,70,75},{90,90,80}	
		};
		int total[] = new int[3];
		System.out.println("\t����\t����\t����\t����\t���");
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(i + 1 + "���л� :");
			int sum = 0;
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
				total[j]+=score[i][j];
			}
			System.out.printf("%d \t %.2f \n",sum,(double)sum/score[i].length);
		}
		System.out.print("��������:\t");
		for (int i = 0; i < total.length; i++) {
			System.out.print(total[i]+"\t");
		}
		
		System.out.println();
		System.out.print("�������:\t");
		for (int i = 0; i < total.length; i++) {
			System.out.printf("%.2f \t",(double)total[i]/score.length);
		}
	}
}
