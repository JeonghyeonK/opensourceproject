package chap4;

import java.util.Scanner;

public class Rectangle {
	int width;
	int height;

	public int getArea() {
		return width * height;
	}

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); // ��ü ����
		Scanner scanner = new Scanner(System.in);
		System.out.print("�簢���� �ʺ�� : ");
		rect.width = scanner.nextInt();
		System.out.print("�簢���� ���̴� : ");
		rect.height = scanner.nextInt();
		System.out.println(">> �簢���� ������ : " + rect.getArea());
		scanner.close();
	}
}