package ua.edu.ucu.apps;

public class BirthdayStrategy implements MailStrategy {
    @Override
    public String generateMailContent(Client client) {
        return "Happy " + client.getAge() + "th birthday, " + client.getName() + "!";
    }
}