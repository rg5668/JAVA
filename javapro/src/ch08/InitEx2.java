package ch08;

class Block {
	Block() {
		System.out.println("»ý¼ºÀÚ");
	}
	static int cv = 5;
	int iv = 10;
	static {
		System.out.println("static block:" + cv);
	}
	{
		System.out.println("instance block:" + iv);
	}
}
public class InitEx2 {
	public static void main(String[] args) {
		Block b1 = new Block();
		System.out.println("====================");
		Block b2 = new Block();
		Block b3 = new Block();
		Block b4 = new Block();
		Block b5 = new Block();
	}
}
