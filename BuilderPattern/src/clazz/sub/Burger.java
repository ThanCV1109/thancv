package clazz.sub;

import clazz.Wrapper;
import interfac.Item;
import interfac.Packing;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
