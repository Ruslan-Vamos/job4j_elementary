package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TurnTest {

    @Test
    void whenTurnEvenArray() {
        int[] input = {3, 2, 8, 3, 2, 5};
        int[] expected = {5, 2, 3, 8, 2, 3};
        int[] result = Turn.back(input);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnOddArray() {
        int[] input = {38, 5, 4, 25, 11};
        int[] expected = {11, 25, 4, 5, 38};
        int[] result = Turn.back(input);
        assertThat(result).containsExactly(expected);
    }
}