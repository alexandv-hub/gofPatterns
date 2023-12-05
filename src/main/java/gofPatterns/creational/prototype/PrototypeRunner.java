package gofPatterns.creational.prototype;

public class PrototypeRunner {
    public static void main(String[] args) {
        BaseButton baseButton = new BaseButton("Base button", 100, 20);
        System.out.println(baseButton);

        BaseButtonFactory factory = new BaseButtonFactory(baseButton);
        BaseButton baseButtonClone = factory.cloneBaseButton();
        System.out.println(baseButtonClone);
    }
}
