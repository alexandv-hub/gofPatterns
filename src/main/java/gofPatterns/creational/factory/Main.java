package gofPatterns.creational.factory;

public class Main {
    public static void main(String[] args) {
//        TransportFactory transportFactory = createTransportByType("Truck");
//        TransportFactory transportFactory = createTransportByType("Ship");
        TransportFactory transportFactory = createTransportByType("Plane");

        Transport transport = transportFactory.createTransport();
        transport.deliverGoods();
    }

    static TransportFactory createTransportByType(String transport) {
        if (transport.equalsIgnoreCase("Truck")) {
            return new TruckFactory();
        } else if (transport.equalsIgnoreCase("Ship")) {
            return new ShipFactory();
        } else if (transport.equalsIgnoreCase("Plane")) {
            return new PlaneFactory();
        } else {
            throw new RuntimeException("Transport is unknown!");
        }
    }
}
