package gofPatterns.structural.facade;

import java.io.File;

public class FileUploadService {

    boolean isFileUploadedSuccessfully = true; // always true for test purposes

    void uploadFile(File file) {
        if (isFileUploadedSuccessfully) {
            System.out.println("File '" + file.getName() + "' uploaded successfully.");
        } else {
            System.out.println("File '" + file.getName() + "' upload failed.");
        }
    }
}
