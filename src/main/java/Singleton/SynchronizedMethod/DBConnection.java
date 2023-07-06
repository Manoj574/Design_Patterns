package Singleton.SynchronizedMethod;

public class DBConnection {

    private static DBConnection instance = null;
    private DBConnection(){

    }
    public synchronized static DBConnection getInstance(){
        if(instance == null){
            instance = new DBConnection();
        }
        return instance;
    }

}

//Pros:- Actual Singleton and Thread Safe
//Cons:- Super Slow
