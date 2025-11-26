package ua.edu.ucu.apps;

public class MailSender {
    public void sendMail(MailInfo mailInfo) {
        String mailContent = mailInfo.generateMail();
        System.out.println("Sending mail to: " + mailInfo.getClient().getName());
        System.out.println("Email: " + mailInfo.getClient().getId() + "@example.com");
        System.out.println("Content:\n" + mailContent);
        System.out.println("=" .repeat(50));
    }
}
