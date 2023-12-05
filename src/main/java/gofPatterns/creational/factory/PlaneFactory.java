package gofPatterns.creational.factory;

public class PlaneFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
