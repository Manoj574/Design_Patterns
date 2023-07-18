package Adapter;

public class Client {

    public static void main(String[] args) {

        SendGridEmailAdapter sendGridEmailAdapter = new SendGridEmailAdapter();
        EmailHelper adapter = new EmailHelper(sendGridEmailAdapter);
        adapter.sendEmail("abc@gmail.com", "xyz@gmail.com", "Happy Birthday!!!");

    }
}
