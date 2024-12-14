package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TwoNumberSumTest {

    @Test
    void whenTwoEqualsNumbersYesTarget() {
        int[] array = {5, 5};
        int target = 10;
        int[] expected = {0, 1};
        int[] result = TwoNumberSum.getIndexes(array, target);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTwoEqualsNumbersNoTarget() {
        int[] array = {5, 5};
        int target = 13;
        int[] expected = {};
        int[] result = TwoNumberSum.getIndexes(array, target);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenNegativeNumbersYesTarget() {
        int[] array = {-7, -5, 0, 5, 8, 12};
        int target = 3;
        int[] expected = {1, 4};
        int[] result = TwoNumberSum.getIndexes(array, target);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenWithoutNegativeNumbersYesTarget() {
        int[] array = {0, 2, 5, 8, 10, 12};
        int target = 15;
        int[] expected = {2, 4};
        int[] result = TwoNumberSum.getIndexes(array, target);
        assertThat(result).containsExactly(expected);
    }
}