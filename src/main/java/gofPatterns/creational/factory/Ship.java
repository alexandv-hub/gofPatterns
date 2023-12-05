package gofPatterns.creational.factory;

public class Ship implements Transport {
    @Override
    public void deliverGoods() {
        System.out.println("Ship delivers goods...");
    }
}
