package ru.job4j.condition;

public class StringEq {
    public static void main(String[] args) {
        String first = "one";
        String one = "one";
        if (first == one) {
            System.out.println("First equals one");
        } else {
            System.out.println("First does not equals one");
        }
    }
}
