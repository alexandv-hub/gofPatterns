package gofPatterns.creational.singleton;

public class WebSiteMusicPlayer {
    private static WebSiteMusicPlayer webSiteMusicPlayer;

    public static synchronized WebSiteMusicPlayer getWebSiteMusicPlayer() {
        if (webSiteMusicPlayer == null) {
            webSiteMusicPlayer = new WebSiteMusicPlayer();
        }
        return webSiteMusicPlayer;
    }

    private WebSiteMusicPlayer(){

    }

    public void playTrack(Track track) {
        System.out.println("The track '" + track.getName() + "' is playing...");
    }

    public void stopPlayingTrack(Track track) {
        System.out.println("The track '" + track.getName() + "' stopped.");
    }



}
