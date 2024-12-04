package ru.job4j.condition;

public class Game {
    public static void menu(String game) {
        if ("super mario".equals(game)) {
            System.out.println("Start - super mario");
        }
        if ("tanks".equals(game)) {
            System.out.println("Start - tanks");
        }
        if ("tetris".equals(game)) {
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        menu("super mario");
    }
}
