package Strategy;

public class QuarterDiscountStrategy implements OfferStrategy{

    @Override
    public double getDiscount() {
        return 0.25;
    }
}
