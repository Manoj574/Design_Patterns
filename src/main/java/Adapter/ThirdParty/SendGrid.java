package Adapter.ThirdParty;

public class SendGrid {


    public void sendEmail(String from, String to, String content,String[] cc, String[] bcc){
        System.out.println("Email sent from "+from+" to "+to+" using SendGrid");
    }
}
