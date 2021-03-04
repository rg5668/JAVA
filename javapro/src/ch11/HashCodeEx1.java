package ch11;

public class HashCodeEx1 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1 == "abc");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println("==============");
		Value var1 = new Value("abc");
		Value var2 = new Value("abc");
		System.out.println(var1.equals(var2));
		System.out.println(var1.hashCode());
		System.out.println(var2.hashCode());
		System.out.println(System.identityHashCode(var1));
		System.out.println(System.identityHashCode(var2));
	}
}
class Value {
	String value;
	Value(String value) {
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Value) {
			Value v = (Value) obj;
			return value.equals(v.value);}
		else 
		return false;
		}
		@Override
		public int hashCode() {
			return value.hashCode();
		}
	}
