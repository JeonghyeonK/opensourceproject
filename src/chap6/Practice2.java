package chap6;

class Circle {
	int x, y;
	int radius;

	public Circle(int x, int y, int radius) { // 매개 변수를 가진 생성자
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public boolean equals(Circle b) {
		if (x == b.x && y == b.y)
			return true;
		else
			return false;
	}

	public String toString() {
		return "Circle(" + x + "," + y + ")반지름" + radius;
	}

}

public class Practice2 {
	public static void main(String[] args) {
		Circle a = new Circle(2, 3, 5);
		Circle b = new Circle(2, 3, 30);
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if (a.equals(b))
			System.out.println("같은 원");
		else
			System.out.println("서로 다른 원");
	}
}
