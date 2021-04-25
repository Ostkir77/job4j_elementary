package ru.job4j.ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double operOne = x1 - x2;
        double operTwo = y1 - y2;
        double operThree = Math.pow(operOne, 2);
        double operFour = Math.pow(operTwo, 2);
        double operFive = operThree + operFour;
        double rsl = Math.sqrt(operFive);
        return rsl;
    }
    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
