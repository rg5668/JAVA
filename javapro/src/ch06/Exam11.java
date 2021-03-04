package ch06;

public class Exam11 {
	public static void main(String[] args) {
		int arr[][] = 
			{{1},{10,20},{30,40,50},{60,70,80,90},{60,70,80,90,100}};
		int row[] = new int [5];
		int col[] = new int [5];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				row[i] += arr[i][j];
				col[j] += arr[i][j];
				//System.out.print(arr[i][j]+" ");
			}
			System.out.println(i + "row(행)의 합" + row[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "col(행)의 합" + col[i]);
		}
	}
}
