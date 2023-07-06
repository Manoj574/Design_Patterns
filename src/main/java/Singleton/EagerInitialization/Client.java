package Singleton.EagerInitialization;

public class Client {
    public static void main(String[] args) {
        DBConnection con = DBConnection.getInstance();
        System.out.println(con);
    }
}
