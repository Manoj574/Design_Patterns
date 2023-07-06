package Singleton.Enum;

public enum SingletonEnum {
    INSTANCE;
    int value;
    private SingletonEnum(){}   //-> will also be Implicitly declared

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
