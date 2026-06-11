package Week_1_Engineering_Concepts.DesignPatternsMaster;
// Save as Image.java
public interface Image { void display(); }

class RealImage implements Image {
    private String file;
    public RealImage(String file) { this.file = file; load(); }
    private void load() { System.out.println("Loading heavy server asset: " + file); }
    public void display() { System.out.println("Displaying " + file); }
}

class ProxyImage implements Image {
    private RealImage realImage; private String file;
    public ProxyImage(String file) { this.file = file; }
    public void display() {
        if (realImage == null) { realImage = new RealImage(file); }
        realImage.display();
    }
}