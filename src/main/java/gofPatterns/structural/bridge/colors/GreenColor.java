package gofPatterns.structural.bridge.colors;

public class GreenColor implements ShapeColor {
    @Override
    public void fillInWithColor() {
        System.out.println("Filling in shape with green color...\n");
    }
}
