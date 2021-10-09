package chap5;

class Point_5_3 {
	private int x, y; // �� ���� �����ϴ� x, y ��ǥ

	public Point_5_3() {
		this.x = this.y = 0;
	}

	public Point_5_3(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() { // ���� ��ǥ ���
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint_5_3 extends Point_5_3 {
	private String color; // ���� ��

	public ColorPoint_5_3(int x, int y, String color) {
		super(x, y); // Point�� ������ Point(x, y) ȣ��
		this.color = color;
	}

	public void showColorPoint() { // �÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint(); // Point Ŭ������ showPoint() ȣ��
	}
}

public class SuperEx_5_3 {
	public static void main(String[] args) {
		ColorPoint_5_3 cp = new ColorPoint_5_3(5, 6, "blue");
		cp.showColorPoint();
	}
}