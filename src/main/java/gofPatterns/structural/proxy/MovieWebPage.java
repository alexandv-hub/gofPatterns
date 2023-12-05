package gofPatterns.structural.proxy;

public class MovieWebPage implements WebPage {

    VideoFile movieVideoFile;

    public MovieWebPage(VideoFile movieVideoFile) {
        this.movieVideoFile = movieVideoFile;
        loadVideo(movieVideoFile);
    }

    @Override
    public void open() {
        System.out.println("Opening movie web page...");
    }

    public void loadVideo(VideoFile movieVideoFile) {
        System.out.println("Loading " + movieVideoFile.getSize() + "GB '" + movieVideoFile.getName() + "' movie video...");
    }


}
