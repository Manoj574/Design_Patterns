package Composite;

public class Client {
    public static void main(String[] args) {
        Airpods airpods1 = new Airpods();
        Airpods airpods2 = new Airpods();
        Iphone iphone1 = new Iphone();
        Iphone iphone2 = new Iphone();

        Box Box1 = new Box();
        Box Box2 = new Box();
        Box Box3 = new Box();

        Box2.addItem(airpods1);

        Box3.addItem(airpods2);
        Box3.addItem(iphone2);

        Box1.addItem(iphone1);
        Box1.addItem(Box2);
        Box1.addItem(Box3);

        System.out.println("Entire Box1 cost is - "+Box1.getCost());

    }
}
