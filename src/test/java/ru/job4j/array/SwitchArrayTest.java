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

    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int destination = input.length - 1;
        int[] expected = {4, 2, 3, 1};
        int[] result = SwitchArray.swap(input, source, destination);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap1to2() {
        int[] input = {5, 8, 2};
        int source = 1;
        int destination = 2;
        int[] expected = {5, 2, 8};
        int[] result = SwitchArray.swap(input, source, destination);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap3to7() {
        int[] input = {3, 9, 15, 2, 9, 14, 4, 21, 35};
        int source = 3;
        int destination = 7;
        int[] expected = {3, 9, 15, 21, 9, 14, 4, 2, 35};
        int[] result = SwitchArray.swap(input, source, destination);
        assertThat(result).containsExactly(expected);
    }
}