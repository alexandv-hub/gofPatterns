package gofPatterns.structural.facade;

import java.io.File;

public class MainApp {
    public static void main(String[] args) {

        UploadAudioFileFacade facade = new UploadAudioFileFacade();
        File file = new File("pathName");
        facade.uploadAudioFile(file);
    }
}
