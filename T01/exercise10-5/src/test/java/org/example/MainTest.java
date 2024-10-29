package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void firstAndLastDigitTest1() {
        int[] numbersArray = {100, 200, 300, 400};
        int countDigit = Main.countDigit(numbersArray);
        assertEquals(0, countDigit);
    }

    @Test
    public void firstAndLastDigitTest2() {
        int[] numbersArray = {1, 202, 300, 200005, 301213};
        int[] myResultArray = new int[Main.countDigit(numbersArray)];
        int[] resultArray = {1, 202, 301213};

        Main.fillingArray(numbersArray, myResultArray);
        int countDigit = Main.countDigit(numbersArray);
        assertEquals(3, countDigit);

        for (int i = 0; i < resultArray.length; i++) {
            assertEquals(myResultArray[i], resultArray[i]);
        }
    }

    @Test
    public void firstAndLastDigitTest3() {
        int[] numbersArray = {-1, -22, 23, 10000005, -100002, 101, -101};
        int[] myResultArray = new int[Main.countDigit(numbersArray)];
        int[] resultArray = {-1, -22, 101, -101};

        Main.fillingArray(numbersArray, myResultArray);
        int countDigit = Main.countDigit(numbersArray);
        assertEquals(4, countDigit);

        for (int i = 0; i < resultArray.length; i++) {
            assertEquals(myResultArray[i], resultArray[i]);
        }
    }

    @Test
    public void firstAndLastDigitTest4() {
        int[] numbersArray = {0, 0, -0};
        int[] myResultArray = new int[Main.countDigit(numbersArray)];
        int[] resultArray = {0, 0, -0};

        Main.fillingArray(numbersArray, myResultArray);
        int countDigit = Main.countDigit(numbersArray);
        assertEquals(3, countDigit);

        for (int i = 0; i < resultArray.length; i++) {
            assertEquals(myResultArray[i], resultArray[i]);
        }
    }

    @Test
    public void firstAndLastDigitTest5() {
        int[] numbersArray = {10, 22, 20000002, -20000002, 1, 2, 3, -1};
        int[] myResultArray = new int[Main.countDigit(numbersArray)];
        int[] resultArray = {22, 20000002, -20000002, 1, 2, 3, -1};

        Main.fillingArray(numbersArray, myResultArray);
        int countDigit = Main.countDigit(numbersArray);
        assertEquals(7, countDigit);

        for (int i = 0; i < resultArray.length; i++) {
            assertEquals(myResultArray[i], resultArray[i]);
        }
    }
}
