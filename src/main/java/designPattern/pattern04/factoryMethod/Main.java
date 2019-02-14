package designPattern.pattern04.factoryMethod;

import designPattern.pattern04.factoryMethod.framework.Factory;
import designPattern.pattern04.factoryMethod.framework.Product;
import designPattern.pattern04.factoryMethod.idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("세종대왕");
		Product card2 = factory.create("이순신");
		Product card3 = factory.create("강감찬");
		card1.use();
		card2.use();
		card3.use();
	}
}
