package FactoryMethod;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Goods are delivered by Ship");
    }
}
