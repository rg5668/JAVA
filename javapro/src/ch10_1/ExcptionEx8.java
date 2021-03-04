package ch10_1;

import java.util.Scanner;

public class ExcptionEx8 {
	public static void main(String[] args) {
		try {
			String id = "hong";
			String pw = "1234";
			Scanner scan = new Scanner(System.in);
			System.out.println("아이디를 입력하세요.");
			String inputId = scan.nextLine();
			System.out.println("비밀번호를 입력하세요.");
			String inputPw = scan.nextLine();
			if (id.equals(inputId) && pw.equals(inputPw)) {
				System.out.println("로그인 성공");
			} else if (!id.equals(inputId)) {
				throw new LoginFailException("아이디가 틀립니다. 다시 로그인 하세요.");
			} else{
				throw new LoginFailException("비밀번호가 틀립니다. 다시 로그인 하세요.");
			}
		} catch (LoginFailException e) {
			System.out.println("======:"+e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class LoginFailException extends Exception {
	String msg;
	LoginFailException(String msg) {
		this.msg = msg;
//		super(msg);	//이것만 써도됨
	}
	@Override	//super를 쓰고 오버라이드 안해도 똑같은 값 출력
	public String getMessage() {	//Exception이 가진 메서드
		return msg;
	}
}