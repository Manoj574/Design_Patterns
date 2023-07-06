package Singleton.Enum;

public class Client {

    public static void main(String[] args) {
        SingletonEnum obj1 = SingletonEnum.INSTANCE;
        SingletonEnum obj2 = SingletonEnum.INSTANCE;

        obj1.setValue(2);
        System.out.println("obj1 value set to 2");
        System.out.println("printing obj1 value..");
        System.out.println(obj1.getValue());

        obj2.setValue(5);
        System.out.println("obj2 value set to 5");
        System.out.println("printing obj1 value..");
        System.out.println(obj1.getValue());
    }
}
