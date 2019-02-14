package designPattern.pattern03.adapter.extendsEx;

public class Main {

	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}
}
