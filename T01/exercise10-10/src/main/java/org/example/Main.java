package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userCount = validationValue(scanner);

        ArrayList<User> usersArray = new ArrayList<>();

        for (int i = 0; i < userCount; i++) {
            String userName = validUserName(scanner);
            int userAge = validUserAge(scanner);

            if (userAge != -1) {
                User user = new User(userName, userAge);
                usersArray.add(user);
            } else {
                userCount++;
            }
        }

        StringBuilder resultStringBuilder = new StringBuilder();
        usersArray.stream()
                .filter(val -> val.getUserAge() >= 18)
                .forEach(val -> resultStringBuilder.append(val.getUserName()).append(", "));

        if (!resultStringBuilder.isEmpty()) {
            resultStringBuilder.setLength(resultStringBuilder.length() - 2);
            String resultString = resultStringBuilder.toString();
            System.out.println(resultString);
        }

        scanner.close();
    }

    public static int validationValue(Scanner scanner) {
        int value;
        while (true) {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value <= 0) {
                    System.out.println("Incorrect input. userCount <= 0");
                } else {
                    scanner.nextLine();
                    return value;
                }
            } else {
                System.out.println("Couldn't parse a number. Please, try again");
                scanner.nextLine();
            }
        }
    }

    public static String validUserName(Scanner scanner) {
        String userName;
        while (true) {
            userName = scanner.next();
            if (userName.length() >= 2) {
                scanner.nextLine();
                return userName;
            } else {
                System.out.println("Invalid user name. Please, try again");
            }
        }
    }

    public static int validUserAge(Scanner scanner) {
        int value;
        while (true) {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value <= 0) {
                    System.out.println("Incorrect input. Age <= 0");
                    return -1;
                } else {
                    scanner.nextLine();
                    return value;
                }
            } else {
                System.out.println("Couldn't parse a number. Please, try again");
                scanner.nextLine();
            }
        }
    }
}