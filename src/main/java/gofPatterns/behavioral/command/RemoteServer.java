package gofPatterns.behavioral.command;

public class RemoteServer {

    void processGetRequest() {
        System.out.println("Remote server: processing GET request...\n");
    }

    void processPostRequest() {
        System.out.println("Remote server: processing POST request...\n");
    }

    void processPutRequest() {
        System.out.println("Remote server: processing PUT request...\n");
    }

    void processDeleteRequest() {
        System.out.println("Remote server: processing DELETE request...\n");
    }
}
