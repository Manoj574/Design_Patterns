package Adapter;

public class EmailHelper {

    EmailAdapter adapter;

    public EmailHelper(EmailAdapter adapter){
        this.adapter = adapter;
    }

    public void sendEmail(String from, String to, String content){
        adapter.sendEmail(from, to, content);
    }
}
