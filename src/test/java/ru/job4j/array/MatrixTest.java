package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MatrixTest {

    @Test
    void when2on2() {
        int size = 2;
        int[][] expected = {
                {1, 2},
                {2, 4}
        };
        int[][] result = Matrix.multiple(size);
        assertThat(result).isDeepEqualTo(expected);
    }

    @Test
    void when5on5() {
        int size = 5;
        int[][] expected = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {3, 6, 9, 12, 15},
                {4, 8, 12, 16, 20},
                {5, 10, 15, 20, 25},
        };
        int[][] result = Matrix.multiple(size);
        assertThat(result).isDeepEqualTo(expected);
    }
}