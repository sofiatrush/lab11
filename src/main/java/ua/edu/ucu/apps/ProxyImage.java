package ua.edu.ucu.apps;

public class ProxyImage implements MyImage {
    private RealImage realImage;
    private String filename;
    private boolean loaded = false;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            this.realImage = new RealImage(filename);
        }
        
        this.realImage.display();
    }

    public boolean isLoaded() {
        return loaded;
    }
}

