package chap6;

import java.util.Scanner;
import java.util.Random;

class Person3 {
	String name;
	int n1, n2, n3;

	public Person3() {
	}

	public Person3(String name) {
		this.name = name;
	}
}

public class Practice12 {

	public static void print3n(Person3 p) {
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
		int num;
		String a;
		String c;

		System.out.print("겜블링 게임에 참여할 선수 숫자>>");
		num = scanner.nextInt();
		Person3[] person = new Person3[num];

		scanner.nextLine();

		for (int i = 0; i < num; i++) {
			System.out.print((i + 1) + "번째 선수 이름>>");
			a = scanner.nextLine();
			person[i] = new Person3(a);
		}

		Boolean tf = true;
		int ii = 0;
		while (tf) {
			if (ii == num)
				ii = ii - num;
			System.out.print("[" + person[ii].name + "]:<Enter>");

			c = scanner.nextLine();
			while (true) {
				if (c == "")
					break;
			}
			print3n(person[ii]);
			if (person[ii].n1 == person[ii].n2 && person[ii].n2 == person[ii].n3)
				tf = false;
			ii++;
		}
	}
}
