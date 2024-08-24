package ru.job4j;

public class MathFunction {

    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int rst1 = MathFunction.func1(3);
        int rst2 = MathFunction.func2(5);
        int rst3 = MathFunction.func1(100);
        int total = rst1 + rst2;
        System.out.println(total);
    }
}
