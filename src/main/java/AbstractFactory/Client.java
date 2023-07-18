package AbstractFactory;

import AbstractFactory.Products.Button;
import AbstractFactory.Products.CheckBox;

public class Client {

    public static void main(String[] args) {
        Flutter androidFlutter = new Flutter();
        UIFactory androidUIFactory = androidFlutter.getUIFactoryByPlatform(Platform.ANDROID);
        Button androidButton = androidUIFactory.createButton();
        androidButton.renderButton();

        Flutter iosFlutter = new Flutter();
        UIFactory iosUIFactory = iosFlutter.getUIFactoryByPlatform(Platform.IOS);
        CheckBox iosCheckBox = iosUIFactory.createCheckBox();
        iosCheckBox.renderCheckBox();



    }
}
