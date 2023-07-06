package Singleton.DoubleCheckLocking;

public class CreateDBConnection implements Runnable{
    @Override
    public void run() {
        System.out.println(DBConnection.getInstance());
    }
}
