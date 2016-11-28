package controller;

import abstrac.AbstractFactory;
import draw.Circle;
import draw.Retangle;
import draw.Square;
import interf.Color;
import interf.Shape;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shape) {

		if ("circle".equalsIgnoreCase(shape)) {
			return new Circle();
		} else if ("retangle".equalsIgnoreCase(shape)) {
			return new Retangle();
		} else if ("square".equalsIgnoreCase(shape)) {
			return new Square();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {

		return null;
	}
}
