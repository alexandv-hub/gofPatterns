package gofPatterns.structural.facade;

import java.io.File;

public class UploadAudioFileFacade {
    public void uploadAudioFile(File file) {
        FileUploadService fileUploadService = new FileUploadService();
        fileUploadService.uploadFile(file);

        if (fileUploadService.isFileUploadedSuccessfully) {
            FileValidationService fileValidationService = new FileValidationService();
            fileValidationService.validateFileFormat();
            fileValidationService.validateVirusesAbsence();
            fileValidationService.validateCopyright();

            if (fileValidationService.isFileValid) {
                ProcessUploadedFileService processUploadedFileService = new ProcessUploadedFileService();
                processUploadedFileService.encode();
                processUploadedFileService.compress();

                StoreUploadedFileService storeUploadedFileService = new StoreUploadedFileService();
                storeUploadedFileService.store();
            }
        }
    }
}
