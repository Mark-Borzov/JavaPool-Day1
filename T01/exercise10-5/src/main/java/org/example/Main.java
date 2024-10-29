package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = validValue(scanner);
        if (arrayLength <= 0) {
            System.out.println("Input error. Size <= 0");
        } else {
            int[] numbersArray = new int[arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                numbersArray[i] = validValue(scanner);
            }
            if (countDigit(numbersArray) != 0) {
                int[] resultArray = new int[countDigit(numbersArray)];
                fillingArray(numbersArray, resultArray);
                printArray(resultArray);
            } else {
                System.out.println("There are no such elements");
            }
        }
        scanner.close();
    }

    public static int validValue(Scanner scanner) {
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

    public static int countDigit(int[] numbersArray) {
        int countDigit = 0;
        int i = 0;
        while (i < numbersArray.length) {
            if (firstAndLastDigit(numbersArray[i])) {
                countDigit++;
            }
            i++;
        }
        return countDigit;
    }

    public static boolean firstAndLastDigit(int number) {
        if (number < 0) {
            number *= -1;
        }
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        int lastDigit = number % 10;
        return firstDigit == lastDigit;
    }

    public static void fillingArray(int[] numbersArray, int[] resultArray) {
        int resultIndex = 0;
        int i = 0;
        while (i < numbersArray.length) {
            if (firstAndLastDigit(numbersArray[i])) {
                resultArray[resultIndex++] = numbersArray[i];
            }
            i++;
        }
    }

    public static void printArray(int[] resultArray) {
        int i = 0;
        while (i < resultArray.length) {
            System.out.print(resultArray[i] + " ");
            i++;
        }
    }
}