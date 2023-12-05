package gofPatterns.structural.bridge.shapes;

import gofPatterns.structural.bridge.colors.ShapeColor;

public class Triangle extends Shape {

    public Triangle(ShapeColor color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing triangle...");
        color.fillInWithColor();
    }
}
