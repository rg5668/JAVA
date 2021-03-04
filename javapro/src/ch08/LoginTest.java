package ch08;

public class LoginTest {
	public static void main(String[] args) {
		LoginSystem login = new LoginSystem();
		LoginResult result = login.doLogin("hong", "1234");
		result.printResult();
		//false : ���̵� Ȯ���ϼ���.
		
		result = login.doLogin("admin", "12345");
		result.printResult(); //false : ��й�ȣ�� Ȯ���ϼ���.
		
		result = login.doLogin("admin", "1234");
		result.printResult(); //true : admin�� �ݰ����ϴ�
	}
}

class LoginResult {
	boolean result;
	String message;
	
	public void printResult() {
		System.out.println(this.result + " : " + this.message);
	}
}
class LoginSystem {
	public LoginResult doLogin(String id, String pass) {
		LoginResult result = new LoginResult();
		if (id=="admin" && pass=="1234") {
			result.result = true;
			result.message=id+"�� �ݰ����ϴ�.";
		}else if(id != "admin") {
			result.message="���̵� Ȯ���ϼ���.";
		}else {
			result.message="��й�ȣ�� Ȯ���ϼ���.";
		} return result;
	}
}

