package com.demo;

public class Main {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Retangle retangle = (Retangle) shapeFactory.getShape("Retangle");
		Square square = (Square) shapeFactory.getShape("Square");
		Circle circle  = (Circle) shapeFactory.getShape("Circle");
		retangle.draw();
		square.draw();
		circle.draw();
	}

}
