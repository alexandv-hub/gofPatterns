package gofPatterns.structural.bridge.shapes;

import gofPatterns.structural.bridge.colors.ShapeColor;

public class Rectangle extends Shape {

    public Rectangle(ShapeColor color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle...");
        color.fillInWithColor();
    }
}
