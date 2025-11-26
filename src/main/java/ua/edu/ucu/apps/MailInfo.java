package ua.edu.ucu.apps;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MailInfo {
    private Client client;
    private MailStrategy mailStrategy;
    
    public String generateMail() {
        return mailStrategy.generateMailContent(client);
    }
}
