package Adapter;

import Adapter.ThirdParty.MailGun;

public class MailgunAdapter implements EmailAdapter{

    MailGun client = new MailGun();
    @Override
    public void sendEmail(String from, String to, String content) {
        client.sendAsyncMail(from, to, content);
    }
}
