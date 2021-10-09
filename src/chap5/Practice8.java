package chap5;

class Pointtt{
	private int x,y;
	public Pointtt(int x,int y) {this.x=x;this.y=y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x,int y) {
		this.x=x;this.y=y;
	}
}


/*PositivePoint Ŭ����*/
class PositivePoint extends Pointtt{
	
	/*PositivePoint �� ������, �⺻������ (0,0)�� ������.*/
	PositivePoint() {
		super(0,0);
	}
	/*PositivePoint Ŭ������ ������ ��, x,y���� �޴´�. �� �� ���� �����̸� (0,0)���� �޴´�*/
	PositivePoint(int x,int y){
		super(0,0);
		
		if(x>0&&y>0) {
			super.move(x, y);
		}
	}
	 /*��ǥ �̵� �޼��� ���޹��� ���ڸ�ŭ �̵��Ѵ�. �� �� �ϳ��� ���� �����̸� �̵����� �ʴ´�*/
	protected void move(int x,int y) {
		if((x<0)||(y<0)) {
			return;
		}
		super.move(x, y);
	}
	/*String�� ��ȯ�ϴ� �޼���*/
	public String toString() {
		String a="("+super.getX()+","+super.getY()+")�� ��";
		return a;
	}
	
}

public class Practice8 {

	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.move(-5, 5); // ��ü p�� ���� �������� �̵����� ����
		System.out.println(p.toString() + "�Դϴ�.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "�Դϴ�.");

	}

}
