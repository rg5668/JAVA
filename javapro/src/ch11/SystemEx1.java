package ch11;

public class SystemEx1 {
	public static void main(String[] args) {
		System.out.println("System�� ������Ƽ�� ��ȸ");
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("file.separator"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.dir"));
		
		System.out.println("\nȯ�� ������ ��ȸ");
		
		for (String env : System.getenv().keySet()) {
			System.out.println(env + "=" + System.getenv(env));
		}
	}
}
