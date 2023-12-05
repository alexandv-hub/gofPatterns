package gofPatterns.creational.prototype;

public class BaseButtonFactory {
    BaseButton baseButton;

    public BaseButtonFactory(BaseButton baseButton) {
        this.baseButton = baseButton;
    }

    public void setBaseButton(BaseButton baseButton) {
        this.baseButton = baseButton;
    }

    BaseButton cloneBaseButton() {
        return (BaseButton) baseButton.copy();
    }
}
