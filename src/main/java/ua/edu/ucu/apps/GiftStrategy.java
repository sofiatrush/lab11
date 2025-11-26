package ua.edu.ucu.apps;

public class GiftStrategy implements MailStrategy {
    @Override
    public String generateMailContent(Client client) {
        return "Dear " + client.getName() + ", you've received a gift!";
    }
}
