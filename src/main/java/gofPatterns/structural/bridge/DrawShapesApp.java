package gofPatterns.structural.bridge;

import gofPatterns.structural.bridge.colors.GreenColor;
import gofPatterns.structural.bridge.colors.RedColor;
import gofPatterns.structural.bridge.shapes.Rectangle;
import gofPatterns.structural.bridge.shapes.Shape;

public class DrawShapesApp {
    public static void main(String[] args) {
        Shape rectangleGreen = new Rectangle(new GreenColor());
        rectangleGreen.draw();

        Shape rectangleRed = new Rectangle(new RedColor());
        rectangleRed.draw();

        Shape triangle = new Rectangle(new RedColor());
        triangle.draw();
    }
}
