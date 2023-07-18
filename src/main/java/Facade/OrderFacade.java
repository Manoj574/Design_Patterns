package Facade;

public class OrderFacade {

    Kitchen kitchen;
    Waiter waiter;

    public OrderFacade(){
        kitchen = new Kitchen();
        waiter = new Waiter();
    }

    public void orderFood(){
        waiter.writeOrder();
        waiter.sendToKitchen();
        kitchen.prepareFood();
        kitchen.callWaiter();
        waiter.serverCustomer();
        kitchen.washDishes();
    }
}
