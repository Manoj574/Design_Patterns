package Proxy.VirtualProxy;

public class Client {
    public static void main(String[] args) {
        System.out.println("*******Initializing via ProxyImage*******");
        //only filenames are initialized with below code
        Image catImage1 = new ProxyImage("Cat.jpg");
        Image dogImage1 = new ProxyImage("Dog.jpg");
        Image goatImage1 = new ProxyImage("Goat.jpg");
        //catImage is loaded and displayed (other Images are not loaded)
        catImage1.display();

        System.out.println("*******Initializing via RealImage*******");
        //All Images are loaded at Object Initialization itself
        Image catImage2 = new RealImage("Cat.jpg");
        Image dogImage2 = new RealImage("Dog.jpg");
        Image goatImage2 = new RealImage("Goat.jpg");

        //catImage is displayed
        catImage2.display();
    }
}
