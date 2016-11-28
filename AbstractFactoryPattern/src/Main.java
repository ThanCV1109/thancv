import abstrac.AbstractFactory;
import color.Red;
import controller.ColorFactory;
import controller.FactoryProduce;
import controller.ShapeFactory;
import draw.Retangle;
import interf.Color;
import interf.Shape;

public class Main {

	public static void main(String[] args) {
		AbstractFactory abstractFactory = FactoryProduce.getFactory("shape");
		Shape shape = abstractFactory.getShape("retangle");
		shape.draw();
		
		Shape shape2 = abstractFactory.getShape("square");
		shape2.draw();
		
		Retangle retangle = (Retangle) abstractFactory.getShape("Retangle");
		retangle.draw();
		
		AbstractFactory abstractFactory2 = FactoryProduce.getFactory("color");
		Color color = abstractFactory2.getColor("red");
		color.fill();
		Red red = (Red) abstractFactory2.getColor("red");
		red.fill();
	}

}
