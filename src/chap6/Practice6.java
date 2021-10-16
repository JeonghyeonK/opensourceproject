package chap6;

import java.util.Scanner;
import java.util.Calendar;

class Person {
	String Name;
	int sec1, sec2, secResult;

	public Person(String name) {
		this.Name = name;
	}
}

public class Practice6 {

	public static void getSec(Person p, int a) {
		Calendar now = Calendar.getInstance();
		if (a == 1)
			p.sec1 = now.get(Calendar.SECOND);
		if (a == 2)
			p.sec2 = now.get(Calendar.SECOND);
			p.secResult = (p.sec2-p.sec1+60)%60;

	}

	public static void showResult(Person a, Person b) {
		String result;
		if (Math.abs(a.secResult - 10) > Math.abs(b.secResult - 10))
			result = b.Name;
		else if (Math.abs(a.secResult - 10) < Math.abs(b.secResult - 10))
			result = a.Name;
		else
			result = "무승부";

		System.out.print(a.Name + "의 결과 " + a.secResult + ", " + b.Name + "의 결과 " + b.secResult + ", 승자는 " + result);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String c;

		Person a = new Person("황기태");
		Person b = new Person("이재문");
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		System.out.print("황기태 시작 <Enter키>>");

		while (true) {
			c = scanner.nextLine();
			if (c == "")
				break;
		}

		getSec(a, 1);
		System.out.println("   현재 초 시간 = " + a.sec1);
		System.out.print("10초 예상 후 <Enter키>>");

		while (true) {
			c = scanner.nextLine();
			if (c == "")
				break;
		}
		
		getSec(a, 2);
		System.out.println("   현재 초 시간 = " + a.sec2);
		System.out.print("이재문 시작 <Enter키>>");

		while (true) {
			c = scanner.nextLine();
			if (c == "")
				break;
		}
		
		getSec(b, 1);
		System.out.println("   현재 초 시간 = " + b.sec1);
		System.out.print("10초 예상 후 <Enter키>>");

		while (true) {
			c = scanner.nextLine();
			if (c == "")
				break;
		}
		
		getSec(b, 2);
		System.out.println("   현재 초 시간 = " + b.sec2);

		showResult(a, b);
	}

}