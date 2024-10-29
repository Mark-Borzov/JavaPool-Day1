package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void methodOfFindingTest1() {
        int seconds = 3599;
        int[] timeArray = new int[3];
        Main.methodOfFinding(timeArray, seconds);
        String result = String.format("%02d:%02d:%02d", timeArray[0], timeArray[1], timeArray[2]);
        assertEquals("00:59:59", result);
    }

    @Test
    public void methodOfFindingTest2() {
        int seconds = 3601;
        int[] timeArray = new int[3];
        Main.methodOfFinding(timeArray, seconds);
        String result = String.format("%02d:%02d:%02d", timeArray[0], timeArray[1], timeArray[2]);
        assertEquals("01:00:01", result);
    }

    @Test
    public void methodOfFindingTest3() {
        int seconds = 123;
        int[] timeArray = new int[3];
        Main.methodOfFinding(timeArray, seconds);
        String result = String.format("%02d:%02d:%02d", timeArray[0], timeArray[1], timeArray[2]);
        assertEquals("00:02:03", result);
    }

    @Test
    public void methodOfFindingTest4() {
        int seconds = 987698598;
        int[] timeArray = new int[3];
        Main.methodOfFinding(timeArray, seconds);
        String result = String.format("%02d:%02d:%02d", timeArray[0], timeArray[1], timeArray[2]);
        assertEquals("16:43:18", result);
    }

    @Test
    public void methodOfFindingTest5() {
        int seconds = 1;
        int[] timeArray = new int[3];
        Main.methodOfFinding(timeArray, seconds);
        String result = String.format("%02d:%02d:%02d", timeArray[0], timeArray[1], timeArray[2]);
        assertEquals("00:00:01", result);
    }
}
