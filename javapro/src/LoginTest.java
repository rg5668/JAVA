
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
			result.message = id + "�� �ݰ����ϴ�.";
		} else if(!id.equals("admin")) {
			result.message="���̵� Ȯ���ϼ���";
		} else {
			result.message="��й�ȣ�� Ȯ���ϼ���";
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