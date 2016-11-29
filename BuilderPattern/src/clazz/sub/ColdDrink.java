package clazz.sub;

import clazz.Botte;
import interfac.Item;
import interfac.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Botte();
	}

	@Override
	public abstract float price();

}
