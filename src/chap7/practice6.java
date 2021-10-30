
package chap7;

import java.util.*;

class location {
	String name;
	int we;
	int gyeong;
}

public class practice6 {
	public static void main(String[] args) {
// 영어 단어와 한글 단어의 쌍을 저장하는 HashMap 컬렉션 생성

		HashMap<String, location> city = new HashMap<String, location>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("도시, 경도, 위도를 입력하세요");
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
			System.out.print("도시 이름 >> ");
			String name = scanner.nextLine();
			if (name.equals("그만"))
				break;
			location search = city.get(name); 
			if (search == null)
				System.out.println(name + "(은)는 없습니다.");
			else
				System.out.println(name + "  " + city.get(name).gyeong + "  " + city.get(name).we);
			}

		scanner.close();
	}
}