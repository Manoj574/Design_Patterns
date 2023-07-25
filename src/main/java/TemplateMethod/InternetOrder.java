package TemplateMethod;

public class InternetOrder extends OrderProcessTemplate{

    public InternetOrder(boolean isGift){
        this.isGift = isGift;
    }
    @Override
    public void doSelect() {
        System.out.println("Item added to online shopping cart");
        System.out.println("Get gift wrap preference");
        System.out.println("Get delivery address");
    }

    @Override
    public void doPayment() {
        System.out.println("Online payment through Netbanking, card or paytm");
    }

    @Override
    public void doDelivery() {
        System.out.println("your order will be delivered through post to your delivery address");
    }
}
