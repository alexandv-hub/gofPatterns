package gofPatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ConnectionFactory {

    private static final Map<String, Connection> connectionPool = new HashMap<>();

    public Connection getConnectionByProtocol(String protocolType) {
        Connection connection = connectionPool.get(protocolType);

        if (connection == null) {
            switch (protocolType) {
                case "TCP":
                    connection = new TCPConnection();
                    break;
                case "UDP":
                    connection = new UDPConnection();
                    break;
                default:
                    throw new IllegalArgumentException("Unknown connection protocolType: " + protocolType);
            }
            connectionPool.put(protocolType, connection);
        }
        return connection;
    }
}
