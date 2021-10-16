package chap6;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
		String s = scanner.nextLine();
		
		for(int i=0;i<s.length();i++) {
			s = s.substring(1,s.length()) + s.charAt(0);
			System.out.println(s);
		}
	}
}
