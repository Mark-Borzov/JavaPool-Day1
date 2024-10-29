package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int count = 0;
            int prevNumber = 0;
            int currNumber;
            boolean firsInput = true;
            while (true) {
                if (scanner.hasNextInt()) {
                    currNumber = scanner.nextInt();
                    if (!firsInput && (prevNumber > currNumber)) {
                        System.out.println("The sequence is not ordered from the ordinal number of the number " + count);
                        break;
                    }
                    prevNumber = currNumber;
                    firsInput = false;
                    count++;
                } else {
                    System.out.println("The sequence is ordered in ascending order");
                    break;
                }
            }
        } else {
            System.out.println("Input error");
        }
        scanner.close();
    }
}