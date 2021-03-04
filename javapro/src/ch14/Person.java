package ch14;
/*
 * 1) ���� ���� ����
 * Comparable<T>	: sort �� ���� ���
 * public int compareTo(
 * 
 * 2) ���� ��������	: Set add()�� ���� Ȯ��,
 * Object
 * public boolean equals(
 * public int hashCode() {
 */
public class Person implements Comparable<Person> {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "=" + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		return name.equals(p.name) && age == p.age;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	@Override
	public int compareTo(Person o) {
		return age - o.age;
	}	//���� age���� ���� age�� ��
	//https://wjheo.tistory.com/entry/Java-%EC%A0%95%EB%A0%AC%EB%B0%A9%EB%B2%95-Collectionssort
	//����
	
}
