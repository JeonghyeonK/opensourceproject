package chap6;

class Circle {
	int x, y;
	int radius;

	public Circle(int x, int y, int radius) { // �Ű� ������ ���� ������
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
		return "Circle(" + x + "," + y + ")������" + radius;
	}

}

public class Practice2 {
	public static void main(String[] args) {
		Circle a = new Circle(2, 3, 5);
		Circle b = new Circle(2, 3, 30);
		System.out.println("�� a : " + a);
		System.out.println("�� b : " + b);
		if (a.equals(b))
			System.out.println("���� ��");
		else
			System.out.println("���� �ٸ� ��");
	}
}
