package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {

    @Test
    void whenSort() {
        int[] data = {3, 4, 1, 2, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = SortSelected.sort(data);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSort10Elements() {
        int[] data = {8, 1, 3, 5, 9, 7, 6, 2, 4, 0};
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = SortSelected.sort(data);
        assertThat(result).containsExactly(expected);
    }
}