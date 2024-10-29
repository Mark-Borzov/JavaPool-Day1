package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = validNumber(scanner);
        if (number <= 46) {
            int result = fibonacciNumber(number);
            System.out.println(result);
        } else {
            System.out.println("Too large n");
        }
        scanner.close();
    }

    public static int validNumber(Scanner scanner) {
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

    public static int fibonacciNumber(int number) {
        if (number <= 2) {
            return 1;
        } else {
            return fibonacciNumber(number - 1) + fibonacciNumber(number - 2);
        }
    }
}