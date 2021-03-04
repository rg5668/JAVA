package ch16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Car {
	private int month;
	private int con; //�԰�(1), ���(2), ��ǰ(3)
	private String car;
	private int qty;
	private String remark;
	
	public Car(String s) {
		String[] str = s.split(",");
		String temp = "";
		
		try {
			temp = str[4]; //��ǰ����
		} catch (ArrayIndexOutOfBoundsException e) {
			temp = "";
		}
		
		this.month = Integer.parseInt(str[0]);
		this.con = Integer.parseInt(str[1]);
		this.car = str[2];
		this.qty = Integer.parseInt(str[3]);
		this.remark = temp; 
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getCon() {
		return con;
	}

	public void setCon(int con) {
		this.con = con;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Car [month=" + month + ", con=" + con + ", car=" + car + ", qty=" + qty + ", remark=" + remark + "]";
	}
	
	
}

public class GroupingByEx4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =
				new BufferedReader(new FileReader("src/ch16/product.txt"));
		//1)�ʿ��� �ڷḦ collection���� �����.
		Map<String, Map<Integer, Long>> map =
				br.lines()
				.map(s -> new Car(s))
				.filter(s -> s.getCon() == 1) //���� ���ڸ� ���ڴ�
				.collect(Collectors.groupingBy(s -> s.getCar(),//���̸�
						Collectors.groupingBy(s -> s.getMonth(),//��
						Collectors.summingLong(s -> s.getQty()))));//�����Ǹż���
		
		//2)������ ������� collection�� �ٽ� ��Ʈ���� �̿��� ����Ʈ�� �����.
		
		map.entrySet().stream().forEach(s -> {
		System.out.println();
		System.out.println("�ڵ��� �̸�:" + s.getKey());//Ű�� ���̸�
		System.out.println("1��\t 2��\t 3��\t 4��\t 5��\t 6��\t 7��\t 8��\t 9��\t 10��\t 11��\t 12��");
		System.out.println("====================================================================");
		
		long[] mon = new long[12];//(�ε��� 0~11)
								  //(���̴� 12)
		//value���� map�� key�� value
		s.getValue().entrySet().stream().forEach(ss -> {
			mon[ss.getKey()-1]=ss.getValue();
//			System.out.println(ss.getValue());//5452
				//1~12���� �׷��� �ִ� Ű�ε� �ε����� 0~11�����ϱ� -1�� �Ѱ� = ������ �°� mon�� �ֱ�
		});		//getMonth - 1 = getQty
				//�ε��� 0 ~ 11���� ��(�׷�Ű ���·� ���� �� ����) = �ȿ� 1������ ���������� ���� �Ǹż������� 
		
		for(long t : mon) {
			System.out.print("  "+t+"\t");
		}
		System.out.println();
		});
	}
}
