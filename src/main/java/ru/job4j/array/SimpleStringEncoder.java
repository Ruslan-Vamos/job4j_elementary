package ru.job4j.array;

public class SimpleStringEncoder {

    public static String encode(String input) {
        String result = "";
        int counter = 1;
        char symbol = input.charAt(0);
        for (int i = 0; i < input.length(); i++) {
            if (input.length() > 1 && symbol == input.charAt(i) && i > 0) {
                counter++;
            } else {
                symbol = input.charAt(i);
                result += counter == 1 ? String.valueOf(symbol) : counter + String.valueOf(input.charAt(i));
                counter = 1;
            }
        }
        return counter > 1 ? result + counter : result;
    }
}