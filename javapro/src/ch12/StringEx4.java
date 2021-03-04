package ch12;
/*
 * String 값에 따라 주소가 설정됨
 * str의 주소가 값의 입력에 따라 바뀐다
 * *주소값 설정되는거 기억하기*
 */
public class StringEx4 {
	public static void main(String[] args) {
		String str = "ABC";	//100
		String str1 = "ABC";	//100
		if(str == str1)
			System.out.println("str==str1 주소 같음");
		System.out.println("main :" +str);
		change(str);	//주소 설정하지 않음
		System.out.println("주소 설정하지 않음 change 이후 main :" + str);//100
		str = change(str);	//주소 재설정
		System.out.println("주소 재설정 change 이후 main-재설정" + str);
		
		str = "12345678";
		System.out.println(str.substring(3)); //주소 설정하지 않음
		System.out.println("str.substring(3) 이후 :"+str);
		
		str = str.substring(3); //주소 재설정
		System.out.println("str = str.substring(3)이후 :"+str);
	}
	
	static String change(String str) {
		str += "456";	//200
		System.out.println("change() s :" + str);
		return str;
	}
}
