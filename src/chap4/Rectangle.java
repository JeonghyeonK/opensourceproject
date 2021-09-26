package chap4;

import java.util.Scanner;

public class Rectangle {
	int width;
	int height;

	public int getArea() {
		return width * height;
	}

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); // 객체 생성
		Scanner scanner = new Scanner(System.in);
		System.out.print("사각형의 너비는 : ");
		rect.width = scanner.nextInt();
		System.out.print("사각형의 높이는 : ");
		rect.height = scanner.nextInt();
		System.out.println(">> 사각형의 면적은 : " + rect.getArea());
		scanner.close();
	}
}