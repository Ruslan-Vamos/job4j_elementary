package ru.job4j.loop;

public class Slash {

    public static void draw(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                boolean slash = i == j;
                boolean backslash = j == (size - 1) - i;
                    if (slash || backslash) {
                    System.out.print("O");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        draw(3);
        draw(5);
        draw(7);
    }
}
