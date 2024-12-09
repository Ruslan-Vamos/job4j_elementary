package ru.job4j.loop;

import java.util.Scanner;

public class DoWhileExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int password;
        do {
            System.out.println("¬ведите пароль: ");
            password = scanner.nextInt();
        } while (555 != password);
        System.out.println("ѕароль введен успешно!");
    }
}
