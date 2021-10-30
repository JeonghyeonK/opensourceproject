
package chap7;

import java.util.Vector;
import java.util.Scanner;

public class practice4 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		boolean tf = true;
		while (tf) {
			System.out.print("강수량 입력 (0입력시 종료)>>");
			int newmem = scanner.nextInt();
			if (newmem == 0)
				break;
			v.add(newmem);
			for (int i = 0; i < v.size(); i++) {
				System.out.print(v.get(i) + " ");
			}

			int sum = 0;
			for (int i = 0; i < v.size(); i++) {
				int n = v.elementAt(i);
				sum += n;
			}
			sum /= v.size();
			System.out.println("\r\n현재 평균 " + sum);

		}
	}
}
