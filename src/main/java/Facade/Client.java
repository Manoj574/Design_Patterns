package Facade;

public class Client {

    public static void main(String[] args) {
        OrderFacade order = new OrderFacade();
        order.orderFood();
    }
}
