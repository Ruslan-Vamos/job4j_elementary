package ru.job4j.array;

public class TwoNumberSum {

    public static int[] getIndexes(int[] array, int target) {
        int[] result = new int[0];
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            int sum = array[i] + array[j];
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else {
                result = new int[]{i, j};
                break;
            }
        }
        return result;
    }
}
