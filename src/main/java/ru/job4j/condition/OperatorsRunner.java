package ru.job4j.condition;

public class OperatorsRunner {
    public static void main(String[] args) {
        int first = 2;
        int second = 10;
        first += second;
        System.out.println("Result sum: " + first);
        first = 2;
        second -= first;
        System.out.println("Result subtract: " + second);
        second = 10;
        first *= second;
        System.out.println("Result multiply: " + first);
        first = 2;
        second /= first;
        System.out.println("Result divide: " + second);
        second = 10;
        second %= first;
        System.out.println("Result remainder after division 10 by 2: " + second);
        second = 7;
        second %= first;
        System.out.println("Result remainder after division 7 by 2: " + second);
        int i = 100;
        System.out.println("Before increment: " + i);
        i++;
        System.out.println("After increment: " + i);
        i--;
        System.out.println("After decrement: " + i);
        i = 100;
        System.out.println("Use postincrement: " + i++);
        System.out.println("After postincrement: " + i);
        System.out.println("Use postdecrement: " + i--);
        System.out.println("After postdecrement: " + i);
        i = 100;
        System.out.println("Before preincrement: " + i);
        System.out.println("Use preincrement: " + ++i);
        System.out.println("Before predecrement: " + i);
        System.out.println("Use predecrement: " + --i);
    }
}
