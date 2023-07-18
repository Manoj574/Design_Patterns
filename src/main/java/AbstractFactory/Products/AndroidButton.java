package AbstractFactory.Products;

public class AndroidButton implements Button{


    @Override
    public void renderButton() {
        System.out.println("Rendering Android Button");
    }
}
