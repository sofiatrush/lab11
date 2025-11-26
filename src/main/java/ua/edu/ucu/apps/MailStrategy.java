package ua.edu.ucu.apps;

public interface MailStrategy {
    String generateMailContent(Client client);
}