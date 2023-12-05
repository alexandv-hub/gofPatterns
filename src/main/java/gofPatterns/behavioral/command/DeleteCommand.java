package gofPatterns.behavioral.command;

public class DeleteCommand implements RestCommand {
    RemoteServer remoteServer;

    public DeleteCommand(RemoteServer remoteServer) {
        this.remoteServer = remoteServer;
    }

    @Override
    public void execute() {
        remoteServer.processPostRequest();
    }
}
