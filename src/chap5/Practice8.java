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


/*PositivePoint 클래스*/
class PositivePoint extends Pointtt{
	
	/*PositivePoint 의 생성자, 기본값으로 (0,0)을 가진다.*/
	PositivePoint() {
		super(0,0);
	}
	/*PositivePoint 클래스를 생성할 때, x,y값을 받는다. 이 때 값이 음수이면 (0,0)값을 받는다*/
	PositivePoint(int x,int y){
		super(0,0);
		
		if(x>0&&y>0) {
			super.move(x, y);
		}
	}
	 /*좌표 이동 메서드 전달받은 인자만큼 이동한다. 이 때 하나라도 값이 음수이면 이동하지 않는다*/
	protected void move(int x,int y) {
		if((x<0)||(y<0)) {
			return;
		}
		super.move(x, y);
	}
	/*String을 반환하는 메서드*/
	public String toString() {
		String a="("+super.getX()+","+super.getY()+")의 점";
		return a;
	}
	
}

public class Practice8 {

	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(-5, 5); // 객체 p는 음수 공간으로 이동되지 않음
		System.out.println(p.toString() + "입니다.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");

	}

}
