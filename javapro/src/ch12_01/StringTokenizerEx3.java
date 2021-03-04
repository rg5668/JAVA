package ch12_01;

import java.util.StringTokenizer;

public class StringTokenizerEx3 {
	public static void main(String[] args) {
		String source = "1,��õ��,100,100,100|2,�ڼ���,95,90,90|3,���ڹ�,88,88,78";
		StringTokenizer st = new StringTokenizer(source, "|");
		int ktot=0, etot=0, mtot=0;
		int k=0, e=0, m=0;
		System.out.println("��ȣ\t �̸�\t ����\t ����\t ����\t �հ�\t");
		System.out.println("==========================================");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			
			StringTokenizer st2 = new StringTokenizer(token, ",");
			
			System.out.print(st2.nextToken()+"\t");
			System.out.print(st2.nextToken()+"\t");
			k=Integer.parseInt(st2.nextToken());
			e=Integer.parseInt(st2.nextToken());
			m=Integer.parseInt(st2.nextToken());
			
			ktot+=k;
			etot+=e;
			mtot+=m;
			System.out.print(k+"\t"+e+"\t"+m+"\t"+(k+e+m));
			
			System.out.println();
		}
		System.out.println("==========================================");
		System.out.print("�հ� \t \t"+ktot+"\t"+etot+"\t"+mtot+"\t"+(ktot+etot+mtot));
	}
}
