package gofPatterns.creational.prototype;

public class BaseButton implements Copyable {
    private String label;
    private int width;
    private int height;

    public BaseButton(String label, int width, int height) {
        this.label = label;
        this.width = width;
        this.height = height;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public Object copy() {
        return new BaseButton(label, width, height);
    }

    @Override
    public String toString() {
        return "BaseButton{" +
                "label='" + label + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
