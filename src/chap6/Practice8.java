package chap6;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		String s = scanner.nextLine();
		
		for(int i=0;i<s.length();i++) {
			s = s.substring(1,s.length()) + s.charAt(0);
			System.out.println(s);
		}
	}
}
