package AbstractFactory.Products;

public class IosButton implements Button{
    @Override
    public void renderButton() {
        System.out.println("Rendering IOS Button");
    }
}
