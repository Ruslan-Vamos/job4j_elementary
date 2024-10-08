package ru.job4j.condition;

public class TriangleArea {

    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double rst = area(2, 2, 2);
        System.out.println("area of (2, 2, 2) is " + rst);
    }
}
