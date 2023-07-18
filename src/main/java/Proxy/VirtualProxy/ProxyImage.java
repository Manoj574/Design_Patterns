package Proxy.VirtualProxy;

public class ProxyImage implements Image {

    RealImage realImage;
    String filename;

    public ProxyImage(String filename){
        this.filename = filename;
    }
    @Override
    public void display() {
        if(this.realImage == null){
            this.realImage = new RealImage(filename);
        }
        this.realImage.display();
    }
}
