package ru.job4j.condition;

public class RectangleArea {

    public static double square(double p, double k) throws IllegalAccessException {

        if (k == 0) {
            throw new IllegalAccessException("k must not be zero");
        }

        double l = p / (2 + 2 / k);
        double h = l / k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) throws IllegalAccessException {
        double rst1 = square(4, 1);
        System.out.println("p = 4, k = 1, s = 1, real = " + rst1);
        double rst2 = square(6, 2);
        System.out.println("p = 6, k = 2, s = 2, real = " + rst2);
    }
}
