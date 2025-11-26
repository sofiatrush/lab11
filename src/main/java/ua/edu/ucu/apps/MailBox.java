package ua.edu.ucu.apps;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> info;
    
    public MailBox() {
        this.info = new ArrayList<>();
    }
    
    public void addMailInfo(MailInfo mailInfo) {
        info.add(mailInfo);
    }
    
    public void sendAll() {
        MailSender mailSender = new MailSender();
        for (MailInfo mailInfo : info) {
            mailSender.sendMail(mailInfo);
        }
    }
}