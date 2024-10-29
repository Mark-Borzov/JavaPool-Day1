package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = inputMethod(scanner);
        if (seconds != -1) {
            int[] timeArray = new int[3];
            methodOfFinding(timeArray, seconds);
            outputMethod(timeArray);
        } else {
            System.out.println("Incorrect time");
        }
        scanner.close();
    }

    public static int inputMethod(Scanner scanner) {
        int value;
        while (true) {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                scanner.nextLine();
                if (value < 0) {
                    return -1;
                }
                return value;
            } else {
                System.out.println("Couldn't parse a number. Please, try again");
                scanner.nextLine();
            }
        }
    }

    public static void methodOfFinding(int[] timeArray, int seconds) {
        // Нахождение часов;
        timeArray[0] = (seconds / 3600) % 24;
        // Нахождение минут;
        timeArray[1] = (seconds % 3600) / 60;
        // Нахождение секунд;
        timeArray[2] = (seconds % 3600) % 60;
    }

    public static void outputMethod(int[] timeArray) {
        String result = String.format("%02d:%02d:%02d", timeArray[0], timeArray[1], timeArray[2]);
        System.out.println(result);
    }
}