package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class MainTest {
    @Test
    public void SortingByChoiceTest1() {
        double[] myNumbersArray = {100.0, 50.0, 60.0, 10.0};
        Main.SortingByChoice(myNumbersArray);
        double[] NumbersArray = {100.0, 50.0, 60.0, 10.0};
        Arrays.sort(NumbersArray);
        for (int i = 0; i < myNumbersArray.length; i++) {
            assertEquals(myNumbersArray[i], NumbersArray[i]);
        }
    }

    @Test
    public void SortingByChoiceTest2() {
        double[] myNumbersArray = {100.0};
        Main.SortingByChoice(myNumbersArray);
        double[] NumbersArray = {100.0};
        Arrays.sort(NumbersArray);
        for (int i = 0; i < myNumbersArray.length; i++) {
            assertEquals(myNumbersArray[i], NumbersArray[i]);
        }
    }

    @Test
    public void SortingByChoiceTest3() {
        double[] myNumbersArray = {3.1234, 1.4, 4.1234, 1.435, 5.6542, 9.0, 2, 6, 5, 3, 5.123};
        Main.SortingByChoice(myNumbersArray);
        double[] NumbersArray = {3.1234, 1.4, 4.1234, 1.435, 5.6542, 9.0, 2, 6, 5, 3, 5.123};
        Arrays.sort(NumbersArray);
        for (int i = 0; i < myNumbersArray.length; i++) {
            assertEquals(myNumbersArray[i], NumbersArray[i]);
        }
    }

    @Test
    public void SortingByChoiceTest4() {
        double[] myNumbersArray = {3, 3, 3, 3, 3};
        Main.SortingByChoice(myNumbersArray);
        double[] NumbersArray = {3, 3, 3, 3, 3};
        Arrays.sort(NumbersArray);
        for (int i = 0; i < myNumbersArray.length; i++) {
            assertEquals(myNumbersArray[i], NumbersArray[i]);
        }
    }

    @Test
    public void SortingByChoiceTest5() {
        double[] myNumbersArray = {5, 4, 3, 2, 1, 0, -1, -23, 50, 10, 101, -1};
        Main.SortingByChoice(myNumbersArray);
        double[] NumbersArray = {5, 4, 3, 2, 1, 0, -1, -23, 50, 10, 101, -1};
        Arrays.sort(NumbersArray);
        for (int i = 0; i < myNumbersArray.length; i++) {
            assertEquals(myNumbersArray[i], NumbersArray[i]);
        }
    }
}
