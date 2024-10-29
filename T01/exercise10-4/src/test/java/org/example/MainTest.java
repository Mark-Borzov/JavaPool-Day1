package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void arithmeticMeanTest1() {
        int[] array = {1, 2, 3, 4};
        int result = Main.negativeNumbers(array);
        assertEquals(0, result);
    }

    @Test
    public void arithmeticMeanTest2() {
        int[] array = {1, -2, 3, -4};
        int negativeNumbers = Main.negativeNumbers(array);
        int result = Main.arithmeticMean(array, negativeNumbers);
        assertEquals(2, negativeNumbers);
        assertEquals(-3, result);
    }

    @Test
    public void arithmeticMeanTest3() {
        int[] array = {4, 5, -3, 0};
        int negativeNumbers = Main.negativeNumbers(array);
        int result = Main.arithmeticMean(array, negativeNumbers);
        assertEquals(1, negativeNumbers);
        assertEquals(-3, result);
    }

    @Test
    public void arithmeticMeanTest4() {
        int[] array = {3, -1, -3, -5};
        int negativeNumbers = Main.negativeNumbers(array);
        int result = Main.arithmeticMean(array, negativeNumbers);
        assertEquals(3, negativeNumbers);
        assertEquals(-3, result);
    }

    @Test
    public void arithmeticMeanTest5() {
        int[] array = {4, 5, -3, 7, -2};
        int negativeNumbers = Main.negativeNumbers(array);
        int result = Main.arithmeticMean(array, negativeNumbers);
        assertEquals(2, negativeNumbers);
        assertEquals(-2, result);
    }
}
