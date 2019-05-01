package designPattern.chapter02.adapter.extendsEx;

public class PrintBanner extends Banner implements Print {

	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeak() {
		showWithparen();
	}

	@Override
	public void printStrong() {
		showWithAster();
	}

}
