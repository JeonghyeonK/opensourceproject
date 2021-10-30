
package chap7;

import java.util.*;

public class practice2 {
	public static void main(String[] args) {
		ArrayList<Character> a = new ArrayList<Character>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		String s = scanner.nextLine();
		for (int i = 0; i < 6; i++) { 
			char newmem = s.charAt(i * 2);
			a.add(newmem); 
		}
		double d = 0;
		for (int i = 0; i < 6; i++) {
			if (a.get(i) == 'A')
				d += 4;
			else if (a.get(i) == 'B')
				d += 3;
			else if (a.get(i) == 'C')
				d += 2;
			else if (a.get(i) == 'D')
				d += 1;
			else if (a.get(i) == 'F')
				d += 0;
		}
		d /= 6;
		System.out.println(d);
		scanner.close();
	}
}

