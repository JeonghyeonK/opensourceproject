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
			result = "���º�";

		System.out.print(a.Name + "�� ��� " + a.secResult + ", " + b.Name + "�� ��� " + b.secResult + ", ���ڴ� " + result);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String c;

		Person a = new Person("Ȳ����");
		Person b = new Person("���繮");
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		System.out.print("Ȳ���� ���� <EnterŰ>>");

		while (true) {
			c = scanner.nextLine();
			if (c == "")
				break;
		}

		getSec(a, 1);
		System.out.println("   ���� �� �ð� = " + a.sec1);
		System.out.print("10�� ���� �� <EnterŰ>>");

		while (true) {
			c = scanner.nextLine();
			if (c == "")
				break;
		}
		
		getSec(a, 2);
		System.out.println("   ���� �� �ð� = " + a.sec2);
		System.out.print("���繮 ���� <EnterŰ>>");

		while (true) {
			c = scanner.nextLine();
			if (c == "")
				break;
		}
		
		getSec(b, 1);
		System.out.println("   ���� �� �ð� = " + b.sec1);
		System.out.print("10�� ���� �� <EnterŰ>>");

		while (true) {
			c = scanner.nextLine();
			if (c == "")
				break;
		}
		
		getSec(b, 2);
		System.out.println("   ���� �� �ð� = " + b.sec2);

		showResult(a, b);
	}

}