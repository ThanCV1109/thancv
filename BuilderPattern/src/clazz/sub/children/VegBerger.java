package clazz.sub.children;

import clazz.sub.Burger;

public class VegBerger extends Burger {

	@Override
	public String name() {
		return "Veg Berger";
	}

	@Override
	public float price() {
		return 3.0f;
	}

}
