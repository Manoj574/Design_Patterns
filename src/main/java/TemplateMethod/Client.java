package TemplateMethod;

public class Client {

    public static void main(String[] args) {
        OrderProcessTemplate netOrder = new InternetOrder(true);
        OrderProcessTemplate storeOrder = new StoreOrder(false);

        netOrder.processOrder();
        storeOrder.processOrder();
    }
}
