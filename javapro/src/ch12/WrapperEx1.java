package ch12;
/*
 * ������ Wapper Ŭ������ �⺻�ڷ������̿��� �ڵ� ����ȯ�� �����ϴ�.
 * �̰��� �츮�� �ڽ�(Boxin)�� ��ڽ�(Unboxing)�̶� �Ѵ�
 * 
 * �ٸ� Ÿ���� Unboxing�� ���� (�⺻�� type�� auto Casting ����)
 * �ٸ� Ÿ���� boxing�� �Ұ���
 * 
 * equals,compareTo,toString,hashCode ��� �������̵� �Ǿ�����
 */
public class WrapperEx1 {
	public static void main(String[] args) {
		Integer i = new Integer(100);	//boxing ���忡 �ִ�
		Integer i2 = new Integer(123);
		int iii = i;	//unboxing	//������
		double d = (double)(int)i;//�����unboxing
		float f = i;//������unboxing
		Short s = (short)(int)i;
		Double d2 = (double)(int)i;
		Double d3 = d;//������unboxing
		
		System.out.println("i==i2 ?"+(i==i2));
		System.out.println("i.equals(i2) ?"+i.equals(i2));
		//compareTo�� ������� A�� B���� ũ�� 1,������ 0,A�� B���� ������ -1
		System.out.println("i.compareTo(i2)="+i.compareTo(i2)); 
		System.out.println("i.toString()="+i.toString());
		System.out.println("MAX_VALUE="+Integer.MAX_VALUE);
		System.out.println("MIN_VALUE="+Integer.MIN_VALUE);
		System.out.println("SIZE="+Integer.SIZE+" bits");
		System.out.println("BYTES="+Integer.BYTES+" bytes");
		System.out.println("TYPE="+Integer.TYPE);
	}
}
