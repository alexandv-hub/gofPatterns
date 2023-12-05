package gofPatterns.behavioral.command;

public class RestClient {
    GetCommand getRequest;
    PostCommand postRequest;
    PutCommand putRequest;
    DeleteCommand deleteRequest;

    public RestClient(GetCommand getRequest, PostCommand postRequest, PutCommand putRequest, DeleteCommand deleteRequest) {
        this.getRequest = getRequest;
        this.postRequest = postRequest;
        this.putRequest = putRequest;
        this.deleteRequest = deleteRequest;
    }

    void sendGetRequest() {
        System.out.println("Rest client: sending GET request...");
        getRequest.execute();
    }

    void sendPostRequest() {
        System.out.println("Rest client: sending POST request...");
        postRequest.execute();
    }

    void sendPutRequest() {
        System.out.println("Rest client: sending PUT request...");
        putRequest.execute();
    }

    void sendDeleteRequest() {
        System.out.println("Rest client: sending DELETE request...");
        deleteRequest.execute();
    }
}
