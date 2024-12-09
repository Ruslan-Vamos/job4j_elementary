package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SquareTest {

    @Test
    void whenBound3Then014() {
        int bound = 3;
        int[] expected = new int[]{0, 1, 4};
        int[] result = Square.calculate(bound);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenBound5Then014916() {
        int bound = 5;
        int[] expected = new int[]{0, 1, 4, 9, 16};
        int[] result = Square.calculate(bound);
        assertThat(result).containsExactly(expected);
    }
}