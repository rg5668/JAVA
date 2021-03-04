package ch13;
/*
 * ���׸� : <T,M>�� ��� ���ڰ� ���� �ϴ�. �ַ� ���� �빮�� �� ���ڸ� ����.
 * ���׸� class ����
 */
class Product<A, B> {
	private A kind;
	private B model;
	
	public A getKind() {
		return this.kind;
	}
	public B getModel() {
		return this.model;
	}
	public void setKind(A kind) {
		this.kind = kind;
	}
	public void setModel(B model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Product [kind=" + kind + ", model=" + model + "]";
	}
}
class Car{
	@Override
	public String toString() {
		return "car";
	}
}
class Tv{
	@Override
	public String toString() {
		return "tv";
	}
}
public class GenericEx03 {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());	//Ŭ���� �ҷ�����
		product1.setModel("����ƮTv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		System.out.println(tv + tvModel);
		
		System.out.println(product1);
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("����");
		Car car = product2.getKind();
		String carModel = product2.getModel();
		System.out.println(car + carModel);
		
		System.out.println(product2);
	}
}
