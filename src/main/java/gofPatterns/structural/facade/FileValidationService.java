package gofPatterns.structural.facade;

public class FileValidationService {

    boolean isFileValid = true; // always true for test purposes

    void validateFileFormat() {
        System.out.println("File format validation in progress...");
    }

    void validateVirusesAbsence() {
        System.out.println("Viruses absence validation in progress...");
    }

    void validateCopyright() {
        System.out.println("Copyright validation in progress...");
    }
}
