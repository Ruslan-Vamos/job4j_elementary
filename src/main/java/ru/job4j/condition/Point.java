package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double rst1 = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) is: " + rst1);
        double rst2 = Point.distance(0, 0, 2, 5);
        System.out.println("result (0, 0) to (2, 5) is: " + rst2);
        double rst3 = Point.distance(0, 0, 0, 5);
        System.out.println("result (0, 0) to (5, 0) is: " + rst3);
    }
}
