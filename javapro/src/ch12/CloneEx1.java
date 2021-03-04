package ch12;
//클론은 protected라서 외부 클래스에서 볼수없음
//Object의 clone()은 protected이기 때문에 clone() 메소드를 꼭 override 해야함
//clss내부에서 사용 하여야한다.
//clone()은 반드시 예외처리를 해주어야 한다.
//clone()을 실행 하려면 Cloneable을 implements해야한다. (없으면 콘솔에서 에러)
class Point implements Cloneable{ 
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "x=" + x + ", y=" + y;
	}
	
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
}
public class CloneEx1 {
	public static void main(String[] args) {
		Point original = new Point(3,5);
		Point copy = (Point) original.clone();//복제clone해서 새로운 객체를 생성
		System.out.println(original);
		System.out.println(copy);
	}
}
