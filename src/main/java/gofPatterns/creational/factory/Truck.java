package gofPatterns.creational.factory;

public class Truck implements Transport {
    @Override
    public void deliverGoods() {
        System.out.println("Truck delivers goods...");
    }
}
