package FactoryMethod;

public class Truck implements Transport{


    @Override
    public void deliver() {
        System.out.println("Goods are delivered by Truck");
    }
}
