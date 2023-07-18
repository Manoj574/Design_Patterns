package Proxy.VirtualProxy;

public class RealImage implements Image{

    String filename;
    public RealImage(String filename){
        this.filename = filename;
        loadFileFromDisk(filename);
    }
    @Override
    public void display() {
        System.out.println(filename+"Image is displayed");
    }
    public void loadFileFromDisk(String filename){
        System.out.println(filename+" File is loaded from disk");
    }
}
