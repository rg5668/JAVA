package ch07;
//�ڹ��� 4����, �ν��Ͻ�, �޼���4���� ����ϱ� 

//Ŭ����
class Phone{//Ŭ����
	String color;	// Ŭ������ �������(Ÿ���� ������ Ŭ����) 
	boolean power;	//������ �ν��Ͻ�����(������ �ٸ� ���� ����)
	String no;		//Ŭ������ ����
	
	void power() {		//����޼��带 ȣ���ϸ� �ݴ��� ����� ȣ��
		power =! power;		// ���ο��� void ȣ���Ϸ��� ������.����޼���()
	}
	void send(String no) {//�ż���(��Ʈ����Ŭ���� ������)
		//Ŭ����.����.�޼ҵ� 
		System.out.println(no + "�� ��ȭ �۽� ��~");
	}
	void recive(String no) {//���������� ����Ÿ�� �޼ҵ��(Ŭ���� �Ű�����)
		System.out.println(no + "��ȭ ���� ��~");
	}
}

public class PhoneEx1 {
	public static void main(String[] args) {
		//*����ϱ� ����, Ŭ����, �޼���, ������*
		//Ÿ���� ������ Ŭ����.������ = new Ŭ����������() ->�ش�Ǵ� Ŭ������ �ּҸ� ����
		Phone p1 = new Phone();	
		p1.color = "����";	//����.����=���ͷ�
		p1.power = true;
		p1.no = "01012345678";	//����.����=�Ķ��Ÿ
		
		System.out.println(p1.color + "," + p1.power + "," + p1.no);
		
		//����.�޼���(�Ķ����)
		p1.send("01011111111");
		p1.recive("01011111111");
		
		////Ÿ���� ������ Ŭ����.������ = new Ŭ����������() ->�ش�Ǵ� Ŭ������ �ּҸ� ����
		Phone p2 = new Phone();	//���� Ÿ���� ������ �� �ν��Ͻ��� ������ ���� �ٸ� ���� �����Ҽ��ִ�.
		//Ŭ����.����.�޼ҵ�		����.����
		System.out.println(p2.color + "," + p2.power + "," + p2.no);
		p2.send(null);
		p2.recive(null);
		//���� = ���� (����Ű���ּ� Ÿ�� �ν��Ͻ��� ���� ������ ����)
		p2 = p1;
		
		System.out.println(p2.color + "," + p2.power + "," + p2.no);
		p2.send("01022222222");
		p2.recive("01022222222");
	}
}
