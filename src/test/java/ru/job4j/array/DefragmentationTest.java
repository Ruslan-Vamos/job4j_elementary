package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DefragmentationTest {

    @Test
    void whenOneFirst0() {
        int[] array = {0, 1};
        int[] expected = {1, 0};
        int[] result = Defragmentation.compress(array);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenEmpayArray() {
        int[] array = {};
        int[] expected = {};
        int[] result = Defragmentation.compress(array);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenNotFirst0() {
        int[] array = {1, 0, 2, 0, 3, 0, 4};
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        int[] result = Defragmentation.compress(array);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenFirst0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4};
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        int[] result = Defragmentation.compress(array);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenFirst0AndLast0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4, 0, 0, 0};
        int[] expected = {1, 2, 3, 4, 0, 0, 0, 0, 0, 0};
        int[] result = Defragmentation.compress(array);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenAll0() {
        int[] array = {0, 0, 0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0, 0, 0};
        int[] result = Defragmentation.compress(array);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSomeNumber0() {
        int[] array = {0, 0, 0, 1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        int[] result = Defragmentation.compress(array);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenNotContains0() {
        int[] array = {1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4};
        int[] result = Defragmentation.compress(array);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void when2PointOneFirst0() {
        int[] array = {0, 1};
        int[] expected = {1, 0};
        int[] result = Defragmentation.compress2Point(array);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void when2PointEmptyArray() {
        int[] array = {};
        int[] expected = {};
        int[] result = Defragmentation.compress2Point(array);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void when2PointNotFirst0() {
        int[] array = {1, 0, 2, 0, 3, 0, 4};
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        int[] result = Defragmentation.compress2Point(array);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void when2PointFirst0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4};
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        int[] result = Defragmentation.compress2Point(array);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void when2PointFirst0AndLast0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4, 0, 0, 0};
        int[] expected = {1, 2, 3, 4, 0, 0, 0, 0, 0, 0};
        int[] result = Defragmentation.compress2Point(array);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void when2PointAll0() {
        int[] array = {0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0};
        int[] result = Defragmentation.compress2Point(array);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void when2PointSomeNumber0() {
        int[] array = {0, 0, 0, 1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        int[] result = Defragmentation.compress2Point(array);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void when2PointNotcontains0() {
        int[] array = {1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4};
        int[] result = Defragmentation.compress2Point(array);
        assertThat(result).containsExactly(expected);
    }
}