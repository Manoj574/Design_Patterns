package Singleton.SynchronizedMethod;

public class CreateDBConnection implements Runnable{
    public void run(){
        System.out.println(DBConnection.getInstance());
    }
}
