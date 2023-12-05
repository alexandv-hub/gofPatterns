package gofPatterns.behavioral.command;

public class GetCommand implements RestCommand {
    RemoteServer remoteServer;

    public GetCommand(RemoteServer remoteServer) {
        this.remoteServer = remoteServer;
    }

    @Override
    public void execute() {
        remoteServer.processGetRequest();
    }
}
