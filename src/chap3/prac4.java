package chap3;
import java.util.Scanner;

public class prac4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a=0;
		char b;
		String c;
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		c = scanner.next();
		b = c.charAt(0);
		a = (int)b;
		
		for(int i=0;i<a-96;i++) {
			for(int j=97;j<a-i+1;j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
		
	}

}
