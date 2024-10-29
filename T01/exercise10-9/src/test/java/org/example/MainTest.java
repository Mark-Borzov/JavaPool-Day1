package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void substringTest1() {
        String string = "Hello";
        String substring = "ll";
        assertEquals(string.contains(substring), Main.substring(string, substring));
    }

    @Test
    public void substringTest2() {
        String string = "Hello";
        String substring = "LL";
        assertEquals(string.contains(substring), Main.substring(string, substring));
    }

    @Test
    public void substringTest3() {
        String string = "Hello";
        String substring = "HelloHello";
        assertEquals(string.contains(substring), Main.substring(string, substring));
    }

    @Test
    public void substringTest4() {
        String string = "First car Second door";
        String substring = "oo";
        assertEquals(string.contains(substring), Main.substring(string, substring));
    }

    @Test
    public void substringTest5() {
        String string = "First car Second door";
        String substring = "o";
        assertEquals(string.contains(substring), Main.substring(string, substring));
    }
}
