package chap6;

class Point_6_2 {
int x, y;
public Point_6_2(int x, int y) {
this.x = x;
this.y = y;
}
public String toString() {
return "Point(" + x + "," + y + ")";
}
}
public class ToStringEx_6_2 {
public static void main(String [] args) {
Point_6_2 p = new Point_6_2(2,3);
System.out.println(p.toString());
System.out.println(p); // p는 p.toString()으로 자동 변환
System.out.println(p + "입니다."); // p.toString() + "입니다"로 자동 변환
}
}