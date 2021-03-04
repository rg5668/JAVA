package ch14;
/*
 * 1) 논리적 순위 정의
 * Comparable<T>	: sort 시 순위 사용
 * public int compareTo(
 * 
 * 2) 논리적 동등정의	: Set add()시 동등 확인,
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
	}	//기존 age에서 들어온 age를 비교
	//https://wjheo.tistory.com/entry/Java-%EC%A0%95%EB%A0%AC%EB%B0%A9%EB%B2%95-Collectionssort
	//참고
	
}
