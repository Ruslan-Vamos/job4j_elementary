package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int[] array = new int[]{5, 10, 3};
        int element = 5;
        int expected = 0;
        int result = FindLoop.indexOf(array, element);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] array = new int[]{3, 8, 22};
        int element = 10;
        int expected = -1;
        int result = FindLoop.indexOf(array, element);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenDiapasonHas8ThenResultEqualsFinish() {
        int[] data = {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int element = 8;
        int start = 2;
        int finish = 5;
        int expected = 5;
        int result = FindLoop.indexInRange(data, element, start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenDiapasonHasSomeEqualElementThen3() {
        int[] data = {5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int element = 4;
        int start = 1;
        int finish = 8;
        int expected = 3;
        int result = FindLoop.indexInRange(data, element, start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenDiapasonHas2Then3() {
        int[] data = {5, 2, 10, 2, 4};
        int element = 2;
        int start = 2;
        int finish = 4;
        int expected = 3;
        int result = FindLoop.indexInRange(data, element, start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenDiapasonHasNot3ThenMinus1() {
        int[] data = {8, 12, 3, 12, 15, 1, 6, 11, 3};
        int element = 3;
        int start = 3;
        int finish = 7;
        int expected = -1;
        int result = FindLoop.indexInRange(data, element, start, finish);
        assertThat(result).isEqualTo(expected);
    }
}