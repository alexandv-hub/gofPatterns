package gofPatterns.creational.singleton;

public class WebSiteMusicPlayerRunner {
    public static void main(String[] args) {
        Track track = new Track("Armin van Buuren - Communication");

        WebSiteMusicPlayer.getWebSiteMusicPlayer().playTrack(track);
        WebSiteMusicPlayer.getWebSiteMusicPlayer().stopPlayingTrack(track);
    }
}
