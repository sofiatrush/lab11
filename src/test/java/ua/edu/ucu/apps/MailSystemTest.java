package ua.edu.ucu.apps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MailSystemTest {

    @Test
    void testBirthdayStrategy() {
        Client client = new Client("Alice", 20, Gender.FEMALE);
        MailInfo mailInfo = new MailInfo(client, new BirthdayStrategy());
        
        String content = mailInfo.generateMail();
        
        Assertions.assertTrue(content.contains("Happy 20th birthday"));
        Assertions.assertTrue(content.contains("Alice"));
    }

    @Test
    void testGiftStrategy() {
        Client client = new Client("Bob", 30, Gender.MALE);
        MailInfo mailInfo = new MailInfo(client, new GiftStrategy());
        
        String content = mailInfo.generateMail();
        
        Assertions.assertTrue(content.contains("Bob"));
        Assertions.assertTrue(content.contains("received a gift"));
    }

    @Test
    void testClientCreation() {
        Client client = new Client("John", 40, Gender.MALE);
        Assertions.assertEquals("John", client.getName());
        Assertions.assertEquals(40, client.getAge());
        Assertions.assertTrue(client.getId() > 0);
    }
}