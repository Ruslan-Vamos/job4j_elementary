package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumPlusMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractPlusDivide(double first, double second) {
        return subtract(first, second)
                + divide(first, second);
    }

    public static double mathOperationsSum(double first, double second) {
        return sumPlusMultiply(first, second)
                + subtractPlusDivide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + mathOperationsSum(20, 10));
    }
}
