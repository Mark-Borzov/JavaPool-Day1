package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    void perimeterOfTriangleTest1() {
        // Массив вершин Треугольника:
        double[] vertexArray = new double[6];

        // Вершина №1
        vertexArray[0] = 1.0;
        vertexArray[1] = 2.0;
        // Вершина №2
        vertexArray[2] = 2.0;
        vertexArray[3] = 1.0;
        // Вершина №3
        vertexArray[4] = 5.0;
        vertexArray[5] = 5.0;

        double result = Main.perimeterOfTriangle(vertexArray);
        assertEquals(11.414, result, 0.001);
    }

    @Test
    void perimeterOfTriangleTest2() {
        // Массив вершин Треугольника:
        double[] vertexArray = new double[6];

        // Вершина №1
        vertexArray[0] = 2.0;
        vertexArray[1] = 1.0;
        // Вершина №2
        vertexArray[2] = 2.0;
        vertexArray[3] = 1.0;
        // Вершина №3
        vertexArray[4] = 2.0;
        vertexArray[5] = 1.0;

        double result = Main.perimeterOfTriangle(vertexArray);
        assertEquals(-1, result, 0.001);
    }

    @Test
    void perimeterOfTriangleTest3() {
        // Массив вершин Треугольника:
        double[] vertexArray = new double[6];

        // Вершина №1
        vertexArray[0] = 2.0;
        vertexArray[1] = 1.0;
        // Вершина №2
        vertexArray[2] = 2.0;
        vertexArray[3] = 1.0;
        // Вершина №3
        vertexArray[4] = 3.0;
        vertexArray[5] = 1.0;

        double result = Main.perimeterOfTriangle(vertexArray);
        assertEquals(-1, result, 0.001);
    }

    @Test
    void perimeterOfTriangleTest4() {
        // Массив вершин Треугольника:
        double[] vertexArray = new double[6];

        // Вершина №1
        vertexArray[0] = 0.0;
        vertexArray[1] = 0.0;
        // Вершина №2
        vertexArray[2] = 0.0;
        vertexArray[3] = 3.0;
        // Вершина №3
        vertexArray[4] = 3.0;
        vertexArray[5] = 0.0;

        double result = Main.perimeterOfTriangle(vertexArray);
        assertEquals(10.243, result, 0.001);
    }

    @Test
    void perimeterOfTriangleTest5() {
        // Массив вершин Треугольника:
        double[] vertexArray = new double[6];

        // Вершина №1
        vertexArray[0] = 0.0;
        vertexArray[1] = 0.0;
        // Вершина №2
        vertexArray[2] = 2.0;
        vertexArray[3] = 0.0;
        // Вершина №3
        vertexArray[4] = 0.0;
        vertexArray[5] = 2.0;

        double result = Main.perimeterOfTriangle(vertexArray);
        assertEquals(6.828, result, 0.001);
    }
}