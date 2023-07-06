package Singleton.EagerInitialization;

public class DBConnection {

    private static DBConnection instance = new DBConnection();
    private DBConnection(){

    }
    public synchronized static DBConnection getInstance(){
        return instance;
    }

}


//Pros:- Thread safe and Singleton
//Cons:- Cannot use dynamic values and memory footprint increases during bootup
