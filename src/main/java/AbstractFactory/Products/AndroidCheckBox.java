package AbstractFactory.Products;

public class AndroidCheckBox implements CheckBox{
    @Override
    public void renderCheckBox() {
        System.out.println("Rendering Android CheckBox");
    }
}
