package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MatrixCheckTest {

    @Test
    void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotHasMonoHorizontal() {
        char[][] input = {
                {'X', 'X', ' '},
                {' ', 'X', 'X'},
                {' ', 'X', 'X'},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 0);
        assertThat(result).isFalse();
    }

    @Test
    void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'}
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', 'X', ' '},
                {'X', 'X', 'X'}
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result).isFalse();
    }
}