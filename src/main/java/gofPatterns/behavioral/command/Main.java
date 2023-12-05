package gofPatterns.behavioral.command;

public class Main {
    public static void main(String[] args) {
        RemoteServer remoteServer = new RemoteServer();

        RestClient client = new RestClient(
                new GetCommand(remoteServer),
                new PostCommand(remoteServer),
                new PutCommand(remoteServer),
                new DeleteCommand(remoteServer)
        );

        client.sendGetRequest();
        client.sendPostRequest();
        client.sendPutRequest();
        client.sendDeleteRequest();
    }
}
