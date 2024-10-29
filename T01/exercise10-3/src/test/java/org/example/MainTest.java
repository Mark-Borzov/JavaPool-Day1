package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void fibonacciNumberTest1() {
        int number = 10;
        int result = Main.fibonacciNumber(number);
        assertEquals(55, result);
    }

    @Test
    public void fibonacciNumberTest2() {
        int number = 25;
        int result = Main.fibonacciNumber(number);
        assertEquals(75025, result);
    }

    @Test
    public void fibonacciNumberTest3() {
        int number = 7;
        int result = Main.fibonacciNumber(number);
        assertEquals(13, result);
    }

    @Test
    public void fibonacciNumberTest4() {
        int number = 15;
        int result = Main.fibonacciNumber(number);
        assertEquals(610, result);
    }

    @Test
    public void fibonacciNumberTest5() {
        int number = 30;
        int result = Main.fibonacciNumber(number);
        assertEquals(832040, result);
    }
}
