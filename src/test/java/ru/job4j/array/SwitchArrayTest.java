package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SwitchArrayTest {

    @Test
    void whenSwapBorderArrayLengthIs4() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {4, 2, 3, 1};
        int[] result = SwitchArray.swapBorder(input);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs6() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expected = {6, 2, 3, 4, 5, 1};
        int[] result = SwitchArray.swapBorder(input);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs3() {
        int[] input = {1, 2, 3};
        int[] expected = {3, 2, 1};
        int[] result = SwitchArray.swapBorder(input);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs1() {
        int[] input = {1};
        int[] expected = {1};
        int[] result = SwitchArray.swapBorder(input);
        assertThat(result).containsExactly(expected);
    }
}