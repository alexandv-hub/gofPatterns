package gofPatterns.structural.proxy;

public class VideoFile {
    private String name;
    private int size;

    public VideoFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}
