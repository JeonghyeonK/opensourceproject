package chap5;

import java.util.Scanner;
abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;	//비율
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString()+"을 " + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString()+"을 입력하세요>> ");
		
		double val = scanner.nextDouble();
		double res = convert(val);
		
		System.out.println("변환 결과: "+res + getDestString()+"입니다");
		scanner.close();
	}
}


class km2Mile extends Converter{
	
	km2Mile(double a){
		ratio=a;
	}
	protected double convert(double src) {
		
		return src/ratio;
	}
	protected String getSrcString() {
		return "km";
	}
	protected String getDestString() {
		return "mile";
	}
	
	
}


public class Practice4 {

	public static void main(String[] args) {
		
		km2Mile toMile = new km2Mile(1.6);
		toMile.run();

	}


}
