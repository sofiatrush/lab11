package ua.edu.ucu.apps;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        User user = User.builder()
            .age(10)
            .name("User Name 2")
            .gender(Gender.FEMALE)
            .height(10)
            .weight(10)
            .roles(List.of("Admin", "SuperAdmin"))
            .role("SuperSuperAdmin")
            .build();

        System.out.println(user);
        
        Client client1 = new Client("John Doe", 25, Gender.MALE);
        Client client2 = new Client("Jane Smith", 30, Gender.FEMALE);
        Client client3 = new Client("Bob Johnson", 45, Gender.MALE);
        
        MailBox mailBox = new MailBox();
        
        mailBox.addMailInfo(new MailInfo(client1, new BirthdayStrategy()));
        mailBox.addMailInfo(new MailInfo(client2, new GiftStrategy()));
        mailBox.addMailInfo(new MailInfo(client3, new BirthdayStrategy()));
        
        mailBox.sendAll();

        MyImage image = new ProxyImage("photo.jpg");

        image.display();

        image.display();
    }
}