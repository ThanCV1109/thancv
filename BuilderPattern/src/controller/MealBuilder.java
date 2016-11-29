package controller;

import clazz.sub.children.ChickenBerger;
import clazz.sub.children.Cocacola;
import clazz.sub.children.Pepsi;
import clazz.sub.children.VegBerger;

public class MealBuilder {
	public Meal prepareVegBerger() {
		Meal meal = new Meal();
		meal.addItem(new VegBerger());
		meal.addItem(new Cocacola());

		return meal;
	}

	public Meal prepareChickenBerger() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBerger());
		meal.addItem(new Pepsi());

		return meal;
	}

	public Meal prepareDrink() {
		Meal meal = new Meal();
		meal.addItem(new Pepsi());
		meal.addItem(new Cocacola());

		return meal;
	}
}
