package Singleton.DoubleCheckLocking;

public class Client {
    public static void main(String[] args) {
        CreateDBConnection obj = new CreateDBConnection();
        for(int i = 0;i < 1000;i++){
            Thread t = new Thread(obj);
            t.start();
        }
    }
}
