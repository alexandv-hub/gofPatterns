package gofPatterns.structural.bridge.colors;

public class RedColor implements ShapeColor {
    @Override
    public void fillInWithColor() {
        System.out.println("Filling in shape with red color...\n");
    }
}
