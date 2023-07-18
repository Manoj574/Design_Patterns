package Strategy;

public class StrategyContext {

    double price;
    public StrategyContext(int price){
        this.price = price;
    }

    public OfferStrategy getStrategy(int month){
        if(month <= 6){
            return new NoDiscountStrategy();
        }
        else{
            return new QuarterDiscountStrategy();
        }
    }
    public void applyStrategy(OfferStrategy strategy){
        System.out.println("Price before offer - "+this.price);
        this.price = this.price - (this.price * strategy.getDiscount());
        System.out.println("Price after offer - "+this.price);
    }
}
