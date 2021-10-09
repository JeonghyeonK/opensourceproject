package chap5;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {
	private int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	protected int getColor() {
		return color;
	}

	public void printProperty() {
		int asize = getSize();
		System.out.print(asize + "인치 " + color + "컬러");
	}
}

class IPTV extends ColorTV {
	private String ip;

	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}

	protected String getIP() {
		return ip;
	}

	public void printProperty() {
		int asize = getSize();
		int acolor = getColor();
		System.out.print("나의 IPTV는 " + ip + " 주소의 " + asize + "인치 " + acolor + "컬러");
	}
}

public class Practice2 {
	public static void main(String[] args) {
		IPTV myTV = new IPTV("192.1.1.2", 32, 1024);
		myTV.printProperty();

	}
}