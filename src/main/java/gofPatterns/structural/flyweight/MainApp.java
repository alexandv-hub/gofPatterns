package gofPatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        ConnectionFactory connectionFactory = new ConnectionFactory();

        List<Connection> connections = new ArrayList<>();

        connections.add(connectionFactory.getConnectionByProtocol("TCP"));
        connections.add(connectionFactory.getConnectionByProtocol("TCP"));
        connections.add(connectionFactory.getConnectionByProtocol("TCP"));

        connections.add(connectionFactory.getConnectionByProtocol("UDP"));
        connections.add(connectionFactory.getConnectionByProtocol("UDP"));
        connections.add(connectionFactory.getConnectionByProtocol("UDP"));

        for (Connection connection : connections) {
            System.out.println("\nConnection obj: " + connection);
            connection.connect();
            connection.disconnect();
        }
    }
}

