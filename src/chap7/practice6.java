
package chap7;

import java.util.*;

class location {
	String name;
	int we;
	int gyeong;
}

public class practice6 {
	public static void main(String[] args) {
// ���� �ܾ�� �ѱ� �ܾ��� ���� �����ϴ� HashMap �÷��� ����

		HashMap<String, location> city = new HashMap<String, location>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("����, �浵, ������ �Է��ϼ���");
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			location Location = new location();
			String a = scanner.nextLine();

			int k = 0;
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(j) == ',') {
					if (k == 0) {
						Location.name = a.substring(0, j);
						k = j;
					} else {
						Location.gyeong = Integer.parseInt(a.substring(k + 2, j));
						Location.we = Integer.parseInt(a.substring(j + 2, a.length()));
					}
				}
			}
			city.put(Location.name, Location);
		}

		System.out.println("-------------------------");

		Set<String> keys = city.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String name = it.next();
			System.out.println(name + "  " + city.get(name).gyeong + "  " + city.get(name).we);
		}

		System.out.println("-------------------------");

		while (true) {
			System.out.print("���� �̸� >> ");
			String name = scanner.nextLine();
			if (name.equals("�׸�"))
				break;
			location search = city.get(name); 
			if (search == null)
				System.out.println(name + "(��)�� �����ϴ�.");
			else
				System.out.println(name + "  " + city.get(name).gyeong + "  " + city.get(name).we);
			}

		scanner.close();
	}
}