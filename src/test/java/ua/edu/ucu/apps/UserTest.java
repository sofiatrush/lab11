package ua.edu.ucu.apps;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void testMultipleConstructorsBehaveDifferently() {
        User u1 = new User("Sofia");
        User u2 = new User("Sofia", Gender.FEMALE);
        User u3 = new User("Sofia", 19, Gender.FEMALE);

        assertEquals("Sofia", u1.getName());
        assertNull(u1.getGender());
        assertEquals(0, u1.getAge());

        assertEquals(Gender.FEMALE, u2.getGender());
        assertEquals(0, u2.getAge());

        assertEquals(19, u3.getAge());
    }

    @Test
    void testBuilderCreatesUser() {
        User user = User.builder()
                .name("Bob")
                .age(33)
                .gender(Gender.MALE)
                .weight(82)
                .height(180)
                .role("admin")
                .role("user")
                .build();

        assertEquals("Bob", user.getName());
        assertEquals(2, user.getRoles().size());
    }

    @Test
    void testSingularRoles() {
        User user = User.builder()
                .name("Alice")
                .role("dev")
                .role("qa")
                .build();

        assertEquals(2, user.getRoles().size());
    }
}

