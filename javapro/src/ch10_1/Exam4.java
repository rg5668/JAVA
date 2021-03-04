package ch10_1;

class UnsupportFunctionException extends RuntimeException {
	private final int ERR_CODE;
	UnsupportFunctionException(String msg, int ERR_CODE) {
		super(msg);
		this.ERR_CODE = ERR_CODE;
	}
	public int getErrCode() {
		return ERR_CODE;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage() + ":" + ERR_CODE;
	}
}
public class Exam4 {
	public static void main(String[] args) {
		try {
			throw new UnsupportFunctionException
			("지원하지 않은 기능입니다.", 20050);
		} catch (UnsupportFunctionException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getErrCode());
		}
	}
}
