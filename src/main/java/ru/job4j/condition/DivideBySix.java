package ru.job4j.condition;

public class DivideBySix {

    public static String checkNumber(int number) {
        String result;
        if (number % 3 == 0 && number % 2 == 0) {
            result = "The number is divided by 6";
        } else if (number % 3 != 0 && number % 2 == 0) {
            result = "The number is even but doesn't divided by 3";
        } else if (number % 3 == 0 && number % 2 != 0) {
            result = "The number is divided by 3 but isn't the even number";
        } else {
            result = "The number doesn't divided by 3 and isn't the even number";
        }
        return result;
    }
}
