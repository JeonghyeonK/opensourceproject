package chap3;
import java.util.Scanner;

public class prac6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int a=0;
		
		System.out.print("금액을 입력하시오>>");
		a = scanner.nextInt();
		
		for(int k : unit) {
			int i=0;
			for(;a/k>0;i++) {
				a-=k;
			}
			if(i!=0) System.out.println(k + "원 짜리 : " + i + "개");
		}
	}
}
