package ch11;

class Hash {
	int value;
	Hash(int value) {
		this.value = value;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Hash) {
			Hash v = (Hash)obj;
			return value == v.value;
		}else return false;
	}
	public int hashCode() {
		return value;
	}
}
public class HashCodeEx2 {
	public static void main(String[] args) {
		Hash v1 = new Hash(20);
		Hash v2 = new Hash(20);
		System.out.println(v1.equals(v2));
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		System.out.println("v1 ��ü ��¥ �ؽ��� :" + System.identityHashCode(v1));
		System.out.println("v2 ��ü ��¥ �ؽ��� :" + System.identityHashCode(v2));
	}
}