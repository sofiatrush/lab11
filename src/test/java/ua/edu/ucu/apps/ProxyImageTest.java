package ua.edu.ucu.apps;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProxyImageTest {

    @Test
    void testRealImageNotLoadedImmediately() {
        ProxyImage proxy = new ProxyImage("photo.jpg");

        assertFalse(proxy.isLoaded(), "RealImage should NOT load in constructor");
    }


    @Test
    void testDisplayDoesNotThrow() {
        ProxyImage proxy = new ProxyImage("photo.jpg");

        assertDoesNotThrow(proxy::display);
    }
}

