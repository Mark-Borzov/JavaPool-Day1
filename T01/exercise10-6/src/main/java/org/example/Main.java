package org.example;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int arrayLength = validArrayLength(scanner);
        if (arrayLength <= 0) {
            System.out.println("Input error. Size <= 0");
        } else {
            double[] numbersArray = new double[arrayLength];
            for (int i = 0; i < numbersArray.length; i++) {
                numbersArray[i] = validArrayElement(scanner);
            }
            SortingByChoice(numbersArray);
            printArray(numbersArray);
        }
        scanner.close();
    }

    public static int validArrayLength(Scanner scanner) {
        int value;
        while (true) {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } else {
                System.out.println("Couldn't parse a number. Please, try again");
                scanner.nextLine();
            }
        }
    }

    public static double validArrayElement(Scanner scanner) {
        double value;
        while (true) {
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                scanner.nextLine();
                return value;
            } else {
                System.out.println("Couldn't parse a number. Please, try again");
                scanner.nextLine();
            }
        }
    }

    public static void SortingByChoice(double[] numbersArray) {
        for (int i = 0; i < numbersArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbersArray.length; j++) {
                if (numbersArray[j] < numbersArray[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = numbersArray[minIndex];
            numbersArray[minIndex] = numbersArray[i];
            numbersArray[i] = temp;
        }
    }

    public static void printArray(double[] resultArray) {
        int i = 0;
        while (i < resultArray.length) {
            System.out.print(resultArray[i] + " ");
            i++;
        }
    }
}