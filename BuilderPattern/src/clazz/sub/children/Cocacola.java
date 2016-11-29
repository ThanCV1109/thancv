package clazz.sub.children;

import clazz.sub.ColdDrink;

public class Cocacola extends ColdDrink {

	@Override
	public String name() {
		return "Cocacola";
	}

	@Override
	public float price() {
		return 5.3f;
	}

}
