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
            int negativeNumbers = negativeNumbers(numbersArray);
            if (negativeNumbers != 0) {
                System.out.println(arithmeticMean(numbersArray, negativeNumbers));
            } else {
                System.out.println("There are no negative elements");
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

    public static int negativeNumbers(int[] numbersArray) {
        int counterOfNegativeNumbers = 0;
        for (int i : numbersArray) {
            if (i < 0) {
                counterOfNegativeNumbers++;
            }
        }
        return counterOfNegativeNumbers;
    }

    public static int arithmeticMean(int[] numbersArray, int counterOfNegativeNumbers) {
        int sum = 0;
        for (int i : numbersArray) {
            if (i < 0) {
                sum += i;
            }
        }
        return sum / counterOfNegativeNumbers;
    }
}