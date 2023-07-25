package TemplateMethod;

public abstract class OrderProcessTemplate {

    public boolean isGift;

    public abstract void doSelect();
    public abstract void doPayment();
    public final void giftWrap(){
        if(isGift){
            System.out.println("Gift Wrap Successful");
        }
    }
    public abstract void doDelivery();

    public final void processOrder(){
        doSelect();
        doPayment();
        if(isGift){
            giftWrap();
        }
        doDelivery();
    }
}
