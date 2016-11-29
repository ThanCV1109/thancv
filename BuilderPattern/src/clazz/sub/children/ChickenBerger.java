package clazz.sub.children;

import clazz.sub.Burger;

public class ChickenBerger extends Burger {

	@Override
	public String name() {
		return "Chicken Berger";
	}

	@Override
	public float price() {
		return 5.0f;
	}

}
