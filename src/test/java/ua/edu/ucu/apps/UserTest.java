package ua.edu.ucu.apps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

class UserTest {

    @Test
    void testUserBuilder() {
        User user = User.builder()
                .name("Oles")
                .age(30)
                .gender(Gender.MALE)
                .weight(75.5)
                .height(180)
                .role("Admin")    
                .role("SuperAdmin")  
                .build();

        Assertions.assertEquals("Oles", user.getName());
        Assertions.assertEquals(30, user.getAge());
        Assertions.assertEquals(Gender.MALE, user.getGender());
        Assertions.assertEquals(75.5, user.getWeight());   
        Assertions.assertEquals(2, user.getRoles().size());
        Assertions.assertEquals(List.of("Admin", "SuperAdmin"), user.getRoles());
    }

    @Test
    void testUserToString() {
        User user = User.builder().name("Test").build();
        Assertions.assertNotNull(user.toString());
    }
}