package AbstractFactory.Products;

public class IosCheckBox implements CheckBox{
    @Override
    public void renderCheckBox() {
        System.out.println("Rendering IOS CheckBox");
    }
}
