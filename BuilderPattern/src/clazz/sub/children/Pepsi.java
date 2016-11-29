package clazz.sub.children;

import clazz.sub.ColdDrink;

public class Pepsi extends ColdDrink {

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 5.2f;
	}

}
