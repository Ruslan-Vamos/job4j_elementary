package ru.job4j.array;

public class SimpleStringEncoder {

    public static String encode(String input) {
        String result = "";
        int counter = 1;
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (i < input.length() - 1 && symbol == input.charAt(i + 1)) {
                counter++;
            } else if (i < input.length() - 1 && counter > 1 && symbol != input.charAt(i + 1)) {
                result += String.valueOf(symbol) + counter;
                counter = 1;
            } else if (counter > 1 && i == input.length() - 1) {
                result += String.valueOf(symbol) + counter;
            } else {
                result = result + symbol;
            }
        }
        return result;
    }
}