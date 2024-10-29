package org.example;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        // Массив вершин Треугольника:
        double[] vertexArray = new double[6];

        for (int i = 0; i < vertexArray.length; i++) {
            vertexArray[i] = getVertexCoordinate(scanner);
        }

        if (perimeterOfTriangle(vertexArray) != -1) {
            System.out.printf("Perimeter: %.3f\n", perimeterOfTriangle(vertexArray));
        } else {
            System.out.println("It isn't triangle");
        }

        scanner.close();
    }

    public static double getVertexCoordinate(Scanner scanner) {
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

    public static double perimeterOfTriangle(double[] vertexArray) {
        double perimeter = -1;

        // Вершина №1
        double vertexX1 = vertexArray[0];
        double vertexY1 = vertexArray[1];
        // Вершина №2
        double vertexX2 = vertexArray[2];
        double vertexY2 = vertexArray[3];
        // Вершина №3
        double vertexX3 = vertexArray[4];
        double vertexY3 = vertexArray[5];

        // Сторона 1
        double side1 = Math.sqrt((Math.pow(vertexX2 - vertexX1, 2)) + (Math.pow(vertexY2 - vertexY1, 2)));
        // Сторона 2
        double side2 = Math.sqrt((Math.pow(vertexX3 - vertexX2, 2)) + (Math.pow(vertexY3 - vertexY2, 2)));
        // Сторона 3
        double side3 = Math.sqrt((Math.pow(vertexX3 - vertexX1, 2)) + (Math.pow(vertexY3 - vertexY1, 2)));

        if (existenceOfTriangle(side1, side2, side3)) {
            perimeter = side1 + side2 + side3;
        }

        return perimeter;
    }

    public static boolean existenceOfTriangle(double side1, double side2, double side3) {
        if (side1 > 0 && side2 > 0 && side3 > 0) {
            return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
        }
        return false;
    }
}