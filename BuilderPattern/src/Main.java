import controller.Meal;
import controller.MealBuilder;

public class Main {
	public static void main(String[] args) {
		MealBuilder builder = new MealBuilder();

		System.out.println("-------prepareChickenBerger--------");
		Meal meal = builder.prepareChickenBerger();
		meal.showItems();
		System.out.println("Total: " + meal.getCost());

		System.out.println("-------prepareVegBerger--------");
		Meal meal2 = builder.prepareVegBerger();
		meal2.showItems();
		System.out.println("Total: " + meal2.getCost());

		System.out.println("-------prepareDrink--------");
		Meal meal3 = builder.prepareDrink();
		meal3.showItems();
		System.out.println("Total: " + meal3.getCost());
	}
}
