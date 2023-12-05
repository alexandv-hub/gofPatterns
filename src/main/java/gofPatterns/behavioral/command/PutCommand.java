package gofPatterns.behavioral.command;

public class PutCommand implements RestCommand {
    RemoteServer remoteServer;

    public PutCommand(RemoteServer remoteServer) {
        this.remoteServer = remoteServer;
    }

    @Override
    public void execute() {
        remoteServer.processPostRequest();
    }
}
