package Singleton.SynchronizedMethod;



public class Client {
    public static void main(String[] args) {
        // DBConnection con = new DBConnection(); // not possible
        CreateDBConnection obj = new CreateDBConnection();
        for(int i = 0;i < 10000;i++){
            Thread t = new Thread(obj);
            t.start();
        }


    }
}

