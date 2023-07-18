package FactoryMethod;

public class Client {
    public static void main(String[] args) {
        RoadLogistics roadLogistics = new RoadLogistics();
        Transport roadTransport = roadLogistics.createTransport();
        roadTransport.deliver();

        SeaLogistics seaLogistics = new SeaLogistics();
        Transport seaTransport = seaLogistics.createTransport();
        seaTransport.deliver();
    }
}
