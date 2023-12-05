package gofPatterns.structural.flyweight;

public class UDPConnection implements Connection {
    public void connect() {
        System.out.println("UDP Connection established");
    }

    public void disconnect() {
        System.out.println("UDP Connection closed");
    }

    public String getConnectionType() {
        return "UDP";
    }
}
