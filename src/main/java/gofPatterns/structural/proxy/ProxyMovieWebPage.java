package gofPatterns.structural.proxy;

public class ProxyMovieWebPage implements WebPage {

    VideoFile movieVideoFile;
    MovieWebPage movieWebPage;

    public ProxyMovieWebPage(VideoFile movieVideoFile) {
        this.movieVideoFile = movieVideoFile;
    }

    @Override
    public void open() {
        if (movieWebPage == null) {
            movieWebPage = new MovieWebPage(movieVideoFile);
        }
        movieWebPage.open();
    }
}
