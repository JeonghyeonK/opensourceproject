package chap5;

class Pointt {
	private int x, y;

	public Pointt(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ColorPointt extends Pointt {
	private String color = "BLACK";

	public ColorPointt(int x, int y) {
		super(x, y);
	}

	public ColorPointt() {
		super(0, 0);
	}

	protected String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
		}
	
	public String toString() {
		String a = color + "���� ("+ getX() + "," + getY() + ")�� ��";		
		return a;
	}

	
}

public class Practice6 {
	public static void main(String[] args) {
		ColorPointt zeroPoint = new ColorPointt();
		System.out.println(zeroPoint.toString() + "�Դϴ�.");

		ColorPointt cp = new ColorPointt(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "�Դϴ�.");
	}
}
