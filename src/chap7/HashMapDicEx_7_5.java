package chap7;

import java.util.*;

public class HashMapDicEx_7_5 {
	public static void main(String[] args) {
// ���� �ܾ�� �ѱ� �ܾ��� ���� �����ϴ� HashMap �÷��� ����
		HashMap<String, String> dic = new HashMap<String, String>();
// 3 ���� (key, value) ���� dic�� ����
		dic.put("baby", "�Ʊ�"); // "baby"�� key, "�Ʊ�"�� value
		dic.put("love", "���");
		dic.put("apple", "���");
// ���� �ܾ �Է¹ް� �ѱ� �ܾ� �˻�. "exit" �Է¹����� ����
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("ã�� ���� �ܾ��?");
			String eng = scanner.next();
			if (eng.equals("exit")) {
				System.out.println("�����մϴ�...");
				break;
			}
//�ؽøʿ��� 'Ű' eng�� '��' kor �˻�
			String kor = dic.get(eng);
			if (kor == null)
				System.out.println(eng + "�� ���� �ܾ� �Դϴ�.");
			else
				System.out.println(kor);
		}
		scanner.close();
	}
}


