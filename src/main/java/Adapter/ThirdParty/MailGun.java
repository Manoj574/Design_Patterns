package Adapter.ThirdParty;

public class MailGun {

    public void sendAsyncMail(String from, String to, String content){
        System.out.println("Email sent from "+from+" to "+to+" using MailGun");
    }
}
