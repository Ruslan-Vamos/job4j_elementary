package ru.job4j.array;

public class SimpleStringEncoder {

    public static String encode(String input) {
        String result = "";
        int counter = 1;
        char symbol = input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                result += counter == 1 ? String.valueOf(symbol) : String.valueOf(input.charAt(i - 1)) + counter;
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        return counter == 1 ? result + symbol : result + symbol + counter;
    }
}