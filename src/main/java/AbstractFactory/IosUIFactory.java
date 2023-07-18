package AbstractFactory;

import AbstractFactory.Products.Button;
import AbstractFactory.Products.CheckBox;
import AbstractFactory.Products.IosButton;
import AbstractFactory.Products.IosCheckBox;

public class IosUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new IosCheckBox();
    }
}
