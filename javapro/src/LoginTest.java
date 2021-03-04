
public class LoginTest {
	
	
	public static void main(String[] args) {
		LoginSystem login = new LoginSystem();
		memo result = login.doLogin("hong", "1234");
		result.printResult();
		
		result = login.doLogin("admin", "1234");
		result.printResult();
	}
}
class LoginSystem {
	public memo doLogin(String id, String pass) {
		memo result = new memo();
		if (id.equals("admin")&&pass.equals("1234")) {
			result.result = true;
			result.message = id + "님 반갑습니다.";
		} else if(!id.equals("admin")) {
			result.message="아이디를 확인하세요";
		} else {
			result.message="비밀번호를 확인하세요";
		}
		return result;
	}
	
}
class memo {
	boolean result;
	String message;
	
	public void printResult() {
		System.out.println(this.result + ":" + this.message);
	}
}