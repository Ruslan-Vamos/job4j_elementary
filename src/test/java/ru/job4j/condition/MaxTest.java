package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void when1and2Then2() {
        int result = Max.max(1, 2);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void when3and1Then3() {
        int result = Max.max(3, 1);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void when4and4Then4() {
        int result = Max.max(4, 4);
        assertThat(result).isEqualTo(4);
    }
}