package gofPatterns.structural.flyweight;

public class TCPConnection implements Connection {
    public void connect() {
        System.out.println("TCP Connection established");
    }

    public void disconnect() {
        System.out.println("TCP Connection closed");
    }

    public String getConnectionType() {
        return "TCP";
    }
}
