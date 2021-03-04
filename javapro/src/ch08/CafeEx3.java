package ch08;

class Cylinder {
	int radius;
	int height;
	
	double getVolume(){
		return radius*radius*Math.PI*height;
	}
	double gerArea() {
		return (radius * radius * Math.PI * 2) +
				(radius * 2 * 3.14 * height);
	}
}

public class CafeEx3 {
	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		
		c.radius = 4;
		c.height = 5;
		
		System.out.printf("¿ø±âµÕÀÇ ºÎÇÇ: %.2f\n", c.getVolume());
		System.out.printf("¿ø±âµÕÀÇ °Ñ³ĞÀÌ: %.2f\n", c.gerArea());
	}
}
