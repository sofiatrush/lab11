package ua.edu.ucu.apps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RealImageTest {

    @Test
    void testImageCreation() {
        RealImage img = new RealImage("test.png");
        assertNotNull(img);
    }

    @Test
    void testDisplayDoesNotThrow() {
        RealImage img = new RealImage("test.png");
        assertDoesNotThrow(img::display);
    }
}
