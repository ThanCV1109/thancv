package com.demo;

public class ShapeFactory {
	private static ShapeFactory getInstance;

	public ShapeFactory getInstance() {
		if (getInstance == null) {
			getInstance = new ShapeFactory();
		}
		return getInstance;
	}

	public Shape getShape(String stype) {
		if (stype == null) {
			return null;
		}

		if ("retangle".equalsIgnoreCase(stype)) {
			return new Retangle();
		} else if ("square".equalsIgnoreCase(stype)) {
			return new Square();
		} else if ("circle".equalsIgnoreCase(stype)) {
			return new Circle();
		}

		return null;
	}
}
