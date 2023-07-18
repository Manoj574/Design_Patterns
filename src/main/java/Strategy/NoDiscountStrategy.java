package Strategy;

public class NoDiscountStrategy implements OfferStrategy{
    @Override
    public double getDiscount() {
        return 0;
    }
}
