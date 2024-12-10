package ru.job4j.array;

public class RollBackArray {

    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[result.length - 1 - i] = array[i];
        }
        return result;
    }
}
