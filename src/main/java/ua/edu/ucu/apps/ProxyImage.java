package ua.edu.ucu.apps;

public class ProxyImage implements MyImage {
    
    private RealImage realImage;
    
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            System.out.println("Loading image: " + filename);
            this.realImage = new RealImage(filename);
        }
        
        this.realImage.display();
    }
}
