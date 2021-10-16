package chap6;

import java.util.Scanner;
import java.util.Random;

class Person2 {
	String name;
	int n1, n2, n3;

	public Person2(String name) {
		this.name = name;
	}
}

public class Practice10 {

	public static void print3n(Person2 p) {
		Random random = new Random();
		p.n1 = random.nextInt(3) + 1;
		p.n2 = random.nextInt(3) + 1;
		p.n3 = random.nextInt(3) + 1;

		System.out.print("       " + p.n1 + "  " + p.n2 + "  " + p.n3);

		if (p.n1 == p.n2 && p.n2 == p.n3)
			System.out.println("  " + p.name + "님이 이겼습니다!");
		else
			System.out.println("  아쉽군요!");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a;
		String c;

		System.out.print("1번째 선수 이름>>");
		a = scanner.nextLine();
		Person2 p1 = new Person2(a);
		System.out.print("2번째 선수 이름>>");
		a = scanner.nextLine();
		Person2 p2 = new Person2(a);

		while (true) {
			System.out.print("[" + p1.name + "]:<Enter>");

			while (true) {
				c = scanner.nextLine();
				if (c == "")
					break;
			}

			print3n(p1);
			if (p1.n1 == p1.n2 && p1.n2 == p1.n3)
				break;

			System.out.print("[" + p2.name + "]:<Enter>");

			while (true) {
				c = scanner.nextLine();
				if (c == "")
					break;
			}

			print3n(p2);
			if (p2.n1 == p2.n2 && p2.n2 == p2.n3)
				break;
		}
	}
}
