package designPattern.pattern02.adapter.instanceEx;

public class Main {

	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}
}
