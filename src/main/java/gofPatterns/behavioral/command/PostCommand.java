package gofPatterns.behavioral.command;

public class PostCommand implements RestCommand {
    RemoteServer remoteServer;

    public PostCommand(RemoteServer remoteServer) {
        this.remoteServer = remoteServer;
    }

    @Override
    public void execute() {
        remoteServer.processPostRequest();
    }
}
