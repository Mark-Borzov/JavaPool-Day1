package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;

public class MainTest {
    @Test
    public void fillDoubleArrayTest1() {
        Path path = Path.of("tests/test1.txt");
        String fileData = Main.lineFromTheFile(Main.fileDataOfString(path));
        ArrayList<Double> arrayList = Main.fillArrayList(fileData);
        double[] resultArray = new double[2];
        int countElements = arrayList.get(0).intValue();
        Main.fillDoubleArray(arrayList, resultArray);
        assertEquals(4, countElements);
        assertEquals(10.0, resultArray[0]);
        assertEquals(100.0, resultArray[1]);
    }

    @Test
    public void fillDoubleArrayTest2() {
        Path path = Path.of("tests/test2.txt");
        String fileData = Main.lineFromTheFile(Main.fileDataOfString(path));
        ArrayList<Double> arrayList = Main.fillArrayList(fileData);
        double[] resultArray = new double[2];
        int countElements = arrayList.get(0).intValue();
        Main.fillDoubleArray(arrayList, resultArray);
        assertEquals(3, countElements);
        assertEquals(-1.0, resultArray[0]);
        assertEquals(10.0, resultArray[1]);
    }

    @Test
    public void fillDoubleArrayTest3() {
        Path path = Path.of("tests/test3.txt");
        String fileData = Main.lineFromTheFile(Main.fileDataOfString(path));
        ArrayList<Double> arrayList = Main.fillArrayList(fileData);
        double[] resultArray = new double[2];
        int countElements = arrayList.get(0).intValue();
        Main.fillDoubleArray(arrayList, resultArray);
        assertEquals(5, countElements);
        assertEquals(1.0, resultArray[0]);
        assertEquals(60.0, resultArray[1]);
    }
}
