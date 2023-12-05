package gofPatterns.structural.flyweight;

public interface Connection {
    void connect();
    void disconnect();
    String getConnectionType();
}

