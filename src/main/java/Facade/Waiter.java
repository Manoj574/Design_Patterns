package Facade;

public class Waiter {

    public void writeOrder(){
        System.out.println("Waiter writes Client's order");
    }
    public void sendToKitchen(){
        System.out.println("Order is sent to Kitchen");
    }

    public void serverCustomer(){
        System.out.println("Customer is served with food");
    }
}
