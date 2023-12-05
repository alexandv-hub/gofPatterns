package gofPatterns.creational.factory;

public class Plane implements Transport {
    @Override
    public void deliverGoods() {
        System.out.println("Plane delivers goods...");
    }
}
