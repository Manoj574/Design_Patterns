package TemplateMethod;

public class StoreOrder extends OrderProcessTemplate{

    public StoreOrder(boolean isGift){
        this.isGift = isGift;
    }
    @Override
    public void doSelect() {
        System.out.println("Customer chooses the items from shelf");
    }

    @Override
    public void doPayment() {
        System.out.println("Pays at counter through Cash/Card");
    }

    @Override
    public void doDelivery() {
        System.out.println("Item delivered to customer in delivery counter");
    }
}
