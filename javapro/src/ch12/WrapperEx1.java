package ch12;
/*
 * 지정된 Wapper 클래스와 기본자료형사이에는 자동 형변환이 가능하다.
 * 이것은 우리는 박싱(Boxin)과 언박싱(Unboxing)이라 한다
 * 
 * 다른 타입의 Unboxing은 가능 (기본형 type의 auto Casting 조건)
 * 다른 타입의 boxing은 불가함
 * 
 * equals,compareTo,toString,hashCode 모두 오버라이딩 되어있음
 */
public class WrapperEx1 {
	public static void main(String[] args) {
		Integer i = new Integer(100);	//boxing 상장에 넣다
		Integer i2 = new Integer(123);
		int iii = i;	//unboxing	//꺼내다
		double d = (double)(int)i;//명시적unboxing
		float f = i;//묵시적unboxing
		Short s = (short)(int)i;
		Double d2 = (double)(int)i;
		Double d3 = d;//묵시적unboxing
		
		System.out.println("i==i2 ?"+(i==i2));
		System.out.println("i.equals(i2) ?"+i.equals(i2));
		//compareTo는 결과값이 A가 B보다 크면 1,같으면 0,A가 B보다 작으면 -1
		System.out.println("i.compareTo(i2)="+i.compareTo(i2)); 
		System.out.println("i.toString()="+i.toString());
		System.out.println("MAX_VALUE="+Integer.MAX_VALUE);
		System.out.println("MIN_VALUE="+Integer.MIN_VALUE);
		System.out.println("SIZE="+Integer.SIZE+" bits");
		System.out.println("BYTES="+Integer.BYTES+" bytes");
		System.out.println("TYPE="+Integer.TYPE);
	}
}
