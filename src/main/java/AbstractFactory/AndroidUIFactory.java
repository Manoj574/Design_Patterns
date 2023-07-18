package AbstractFactory;

import AbstractFactory.Products.AndroidButton;
import AbstractFactory.Products.AndroidCheckBox;
import AbstractFactory.Products.Button;
import AbstractFactory.Products.CheckBox;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new AndroidCheckBox();
    }
}
