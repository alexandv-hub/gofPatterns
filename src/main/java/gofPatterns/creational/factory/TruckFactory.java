package gofPatterns.creational.factory;

public class TruckFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
