package Proxy.ProtectionProxy;

public class Client {
    public static void main(String[] args) {
        Internet proxyInternet = new ProxyInternet();
        try{
            proxyInternet.connectTo("xyz.com");
            proxyInternet.connectTo("abc.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
