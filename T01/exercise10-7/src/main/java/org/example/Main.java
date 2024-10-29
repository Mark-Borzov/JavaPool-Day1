package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import static java.nio.file.Files.isRegularFile;
import static java.nio.file.Files.readString;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pathToFile = scanner.nextLine();
        Path path = Path.of(pathToFile);
        if (!(Files.exists(path))) {
            System.out.println("Input error. File isn't exist");
        } else if (!(isRegularFile(path))) {
            System.out.println("This is a catalog");
        } else if (emptyFile(path)) {
            System.out.println("The file is empty");
        } else {
            // Формируем строку с данными из файла:
            String fileData = lineFromTheFile(fileDataOfString(path));
            // Заполняем arrayList значениями из строки fileData:
            ArrayList<Double> arrayList = fillArrayList(fileData);
            if (arrayList.get(0) <= 0) {
                System.out.println("Input error. Size <= 0");
            } else if (arrayList.get(0) > arrayList.size() - 1)  {
                System.out.println("Input error. Insufficient number of elements");
            } else {
                // Минимум и максимум:
                double[] resultArray = new double[2];
                // Кол-во элементов:
                int countElements = arrayList.get(0).intValue();
                fillDoubleArray(arrayList, resultArray);
                resultingFile(resultArray);
                messageDone(arrayList, countElements);
            }
        }
        scanner.close();
    }

    // Данный метод выводит сообщение в консоль:
    public static void messageDone(ArrayList<Double> arrayList, int countElements) {
        System.out.println(countElements);
        for (int i = 0; i < countElements; i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println("\nSaving min and max values in file");
    }

    // Данный метод формирует результирующий файл:
    public static void resultingFile(double[] resultArray) {
        Path resultFIle = Path.of("files/result.txt");
        try {
            StringBuilder dataToWrite = new StringBuilder();
            for (double number : resultArray) {
                dataToWrite.append(number).append(' ');
            }
            Files.writeString(resultFIle, dataToWrite.toString().trim(), StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException exp) {
            System.err.print(exp.getMessage());
        }
    }

    // Данный метод формирует результирующий массив:
    public static void fillDoubleArray(ArrayList<Double> arrayList, double[] resultArray) {
        double[] tempArray = new double[arrayList.get(0).intValue()];
        arrayList.remove(0);
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = arrayList.get(i);
        }
        resultArray[0] = minElementOfArray(tempArray);
        resultArray[1] = maxElementOfArray(tempArray);
    }

    // Данный метод находит максимальный элемент в массиве:
    public static double maxElementOfArray(double[] array) {
        double result = array[0];
        for (double elem : array) {
            if (elem > result) {
                result = elem;
            }
        }
        return result;
    }

    // Данный метод находит минимальный элемент в массиве:
    public static double minElementOfArray(double[] array) {
        double result = array[0];
        for (double elem : array) {
            if (elem < result) {
                result = elem;
            }
        }
        return result;
    }

    // Данный метод заполняет ArrayList числами из строки:
    public static ArrayList<Double> fillArrayList(String string) {
        ArrayList<Double> arrayList = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(string);
        int n = tokenizer.countTokens();
        for (int i = 0; i < n; i++) {
            String token = tokenizer.nextToken();
            try {
                arrayList.add(Double.parseDouble(token));
            } catch (NumberFormatException exp) {
                System.out.print(exp.getMessage());
            }
        }
        return arrayList;
    }

    // Данный метод проверяет файл на пустоту:
    public static boolean emptyFile(Path path) {
        boolean result = false;
        try {
            if (Files.size(path) == 0) {
                result = true;
            }
        } catch (IOException exp) {
            System.out.print(exp.getMessage());
        }
        return result;
    }

    // Данный метод возвращает содержимое файла в виде строки fileData:
    public static String fileDataOfString(Path path) {
        String fileData = "";
        try {
            fileData = readString(path);
        } catch (IOException exp) {
            System.out.print(exp.getMessage());
        }
        return fileData;
    }

    // Данный метод формирует строку для парсинга ее элементов в ArrayList:
    public static String lineFromTheFile(String string) {
        StringBuilder resultString = new StringBuilder();
        String modifiedString = string.replace("\n", " ");
        for (int i = 0; i < modifiedString.length(); i++) {
            char symbol = modifiedString.charAt(i);
            if (symbol == 46 || symbol == 32 || symbol == 45 || (symbol >= 48 && symbol <= 57)) {
                resultString.append(symbol);
            }
        }
        return resultString.toString().trim();
    }
}