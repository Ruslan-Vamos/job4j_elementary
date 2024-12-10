package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MinDiapasonTest {

    @Test
    void whenFirstMin() {
        int[] data = {-1, 0, 5, 10};
        int start = 1;
        int finish = 3;
        int expected = 0;
        int result = MinDiapason.findMin(data, start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLastMin() {
        int[] array = {10, 5, 3, 1};
        int start = 1;
        int finish = 3;
        int expected = 1;
        int result = MinDiapason.findMin(array, start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMiddleMin() {
        int[] data = {10, 2, 5, 1};
        int start = 0;
        int finish = 2;
        int expected = 2;
        int result = MinDiapason.findMin(data, start, finish);
        assertThat(result).isEqualTo(expected);
    }
}