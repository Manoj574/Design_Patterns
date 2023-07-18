package AbstractFactory;

import AbstractFactory.Products.Button;
import AbstractFactory.Products.CheckBox;

public interface UIFactory {

    Button createButton();
    CheckBox createCheckBox();
}
