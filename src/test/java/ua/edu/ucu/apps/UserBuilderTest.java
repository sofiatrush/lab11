package ua.edu.ucu.apps;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserBuilderTest {

    @Test
    void testBloatedConstructorsExist() {
        User u1 = new User("Sofia");
        User u2 = new User("Sofia", Gender.FEMALE);
        User u3 = new User("Sofia", 20, Gender.FEMALE);

        assertEquals("Sofia", u1.getName());
        assertNull(u1.getGender());
        assertEquals(0, u1.getAge());

        assertEquals(Gender.FEMALE, u2.getGender());
        assertEquals(0, u2.getAge());

        assertEquals(20, u3.getAge());
    }

    @Test
    void testBuilderCreatesUser() {
        User u = User.builder()
                .name("Bob")
                .age(30)
                .gender(Gender.MALE)
                .weight(75)
                .height(180)
                .role("admin")
                .role("tester")
                .build();

        assertEquals(2, u.getRoles().size());
        assertEquals("admin", u.getRoles().get(0));
    }

    @Test
    void testSingularAddsElementsOneByOne() {
        User u = User.builder()
                .name("Anna")
                .role("reader")
                .role("editor")
                .build();

        assertEquals(2, u.getRoles().size());
    }
}

