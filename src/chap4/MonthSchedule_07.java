package chap4;

import java.util.Scanner;

public class MonthSchedule_07 {

	private Day days[];
	private Scanner sc;

	public static void main(String[] args) {

		MonthSchedule_07 april = new MonthSchedule_07(30);
		april.run();
	}

	public MonthSchedule_07(int day) {
		// Day days[] = new Day[30]

		days = new Day[day];
		for (int i = 0; i < days.length; i++) {
			days[i] = new Day();
			// days[0] = New Day()
			// days[1] = New Day()
		}
		sc = new Scanner(System.in);
	}

	private void input() {
		System.out.print("날짜(1~30) "); // 1
		int day = sc.nextInt();

		System.out.println("할일(빈칸 없이 입력)"); // java
		String task = sc.next();

		days[day - 1].set(task);
	}

	private void view() {
		System.out.print("날짜(1~30) "); // 1
		int day = sc.nextInt();

		days[day - 1].show();
	}

	private void finish() {
		System.out.println("프로그램을 종료합니다.");

	}

	private void run() {
		System.out.println("이번 달 스케줄 관리 프로그램");

		while (true) {

			System.out.print("할일(입력:1, 보기:2, 끝내기:3)");
			int toDo = sc.nextInt();

			if (toDo == 1)
				input();
			else if (toDo == 2)
				view();
			else if (toDo == 3) {
				finish();
				break;
			}
			else
				System.out.println("잘못 입력");
		}
	}

}
