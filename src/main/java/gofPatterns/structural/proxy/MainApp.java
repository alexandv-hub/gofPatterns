package gofPatterns.structural.proxy;

public class MainApp {
    public static void main(String[] args) {
        VideoFile videoFile = new VideoFile("5th element", 5);
        WebPage webPage = new ProxyMovieWebPage(videoFile);
        webPage.open();
    }
}
