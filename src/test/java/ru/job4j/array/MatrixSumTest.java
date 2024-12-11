package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MatrixSumTest {

    @Test
    void whenSingle() {
        int[][] array = {
                {10}
        };
        int expected = 10;
        int result = MatrixSum.sum(array);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenTwo() {
        int[][] array = {
                {1, 2},
                {1, 2}
        };
        int expected = 6;
        int result = MatrixSum.sum(array);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenThree() {
        int[][] array = {
                {1, 2, 1},
                {1, 2, 0}
        };
        int expected = 7;
        int result = MatrixSum.sum(array);
        assertThat(result).isEqualTo(expected);
    }
}