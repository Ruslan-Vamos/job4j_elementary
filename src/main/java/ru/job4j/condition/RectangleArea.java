package ru.job4j.condition;

public class RectangleArea {

    public static double square(double p, double k) {
        /*
        p = 2 * (l + h);
        l = h * k;
        h = l / k;
        l + l / k = p / 2;
        l * (1 + 1 / k) = p / 2;
        l = (p / 2) / (1 + 1 / k);
        */
        double l = p / (2 + 2 / k);
        double h = l / k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double rst1 = square(4, 1);
        System.out.println("p = 4, k = 1, s = 1, real = " + rst1);
        double rst2 = square(6, 2);
        System.out.println("p = 6, k = 2, s = 2, real = " + rst2);
    }
}
