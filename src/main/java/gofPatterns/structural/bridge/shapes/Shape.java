package gofPatterns.structural.bridge.shapes;

import gofPatterns.structural.bridge.colors.ShapeColor;

public abstract class Shape {
    ShapeColor color;

    public Shape(ShapeColor color) {
        this.color = color;
    }

    public abstract void draw();
}
