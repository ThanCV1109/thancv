package controller;

import abstrac.AbstractFactory;
import color.Blur;
import color.Green;
import color.Red;
import interf.Color;
import interf.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shape) {
		return null;
	}

	@Override
	public Color getColor(String color) {
		if ("red".equalsIgnoreCase(color)) {
			return new Red();
		} else if ("blur".equalsIgnoreCase(color)) {
			return new Blur();
		} else if ("greeen".equalsIgnoreCase(color)) {
			return new Green();
		}
		return null;
	}

}
